function decorador<T extends { new (...args: any[]): {} } >(constructor: T) {
    return class extends constructor {
        nuevaPropiedad = 'Propiedad';
        hello = 'override';
    }
}



@decorador
export class clase {
    id : number;
    nombre : string;
}