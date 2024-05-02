# Exercise 2 Bernhard Auer

In dieser Übung geht es darum, GIT kennenzulernen und zu verwenden. Wir haben unser erstes GIT REPO erstellt, es geclont und angefangen ein Projekt damit zu managen. 

## Beschreibung der GIT Befehle:

- **git config**
  - Konfiguration auf allen Ebenen je nach Parameter:
    1. `--global`: Konfiguration für alle Repositories des Benutzers.
    2. `--local`: Konfiguration spezifisch für das aktuelle Repository.
    3. `--system`: Konfiguration für alle Benutzer auf dem System.

- **git init**
  - Initialisiert ein neues Git-Repository im aktuellen Verzeichnis.
  - Alle notwendigen Metadaten werden erstellt.

- **git commit**
  - Speichert Änderungen, die bereits im Staging-Bereich sind (nach `git add`).
  - Lokal gespeichert.

- **git status**
  - Zeigt den Zustand des Arbeitsverzeichnisses und des Staging-Bereichs an.
  - Lokal ausgeführt.

- **git add**
  - Fügt Änderungen aus dem Arbeitsverzeichnis zum Staging-Bereich hinzu.
  - Änderungen werden lokal im Staging-Bereich vorgenommen.

- **git log**
  - Zeigt die Historie der Commits im aktuellen Repository an.

- **git diff**
  - Zeigt Unterschiede zwischen Commits, Arbeitsverzeichnis und Staging-Bereich an.

- **git pull**
  - Holt Änderungen vom Remote-Repository und integriert sie lokal.

- **git push**
  - Überträgt Commits vom lokalen Repository auf das Remote-Repository.

