# GitHub
## Todo lo visto por Fernando Herrera
### Basico Local e Remoto
* Para iniciar un repositorio `git init`
* Para añadir todo `git add .` o uno especificó `git archivo.txt`
* Para hacer commit es  `git commit -m "name-commit"`
* Para modificar  commit `git commit --amend -m "name-commit"`
* Para ver los commits `git log` o `git log --oneline`
* Para ver el estado `git status` o `git status --short`
* Para ver todos cambios `git reflog`
* Para eliminar ultimo commit `git reset --soft HEAD^`
* Para actualizar el local con el remoto:
```git
git fetch
git pull origin main
```
* Para actualizar cambio de local a remoto `git push origin main`