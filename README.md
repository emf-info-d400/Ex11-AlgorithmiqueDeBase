# Exercice 11 : Algorithmique de base
## Objectifs :
- **Maîtriser la création de méthodes utiles**. Pour cela, il est indispensable de toujours bien distinguer et de comprendre :
  - **ce que la méthode doit faire comme travail** (cela définira son cahier des charges et permettra de définir un nom de méthode adéquat avec un verbe d'action)
  - **les informations à disposition** pour réaliser son travail (cela permettra de définir les paramètres de la méthode)
  - **la nature de la réponse attendue** que la méthode devra fournir (cela permettra de définir son type de retour)
- **Produire des méthodes robustes** (il faut y penser d'avance et faire en sorte que nos méthodes n'explosent pas lorsque des cas particuliers se posent).
- **Entraînement à de l'algorithmique simple** (certaines suites d'opérations (algorithmes) se retrouvent partout en programmation, le temps est désormais venu de rafraîchir ce qui a été vu au module 319 et de maîtriser ces algorithmes de base constamment utilisés et réutilisés en programmation).
- **Bonne préparation à la E1 à venir**.

## Durée :
Environ 2h

## Mission :
**`TRÈS IMPORTANT`** : **Notez vos questions et difficultés rencontrées** au fur et à mesure !  
*C'est le seul moyen efficace d'avancer. Ça vous sera utile pour ne pas les oublier, pour demander au collègue et/ou au prof et/ou en coaching.*

Vous recevez un projet avec trois classes :
- la classe **`Humain`** qui est fournie.
- la classe **`Foule`** qui est cette fois-ci fournie avec toutes les signatures des méthodes souhaitées. **Votre travail consiste cette fois-ci à coder ces méthodes**, proprement, de manière robuste et en respect des enseignements reçus.
- la classe **`Application`** est également fournie. Elle va utiliser le savoir-faire de votre classe `Foule` pour créer des foules d'humains et répondre à plusieurs questions.

## Résultat souhaité :
Si votre implémentation de ces méthodes est correcte, vous devriez obtenir le résultat suivant sur la console :
```
======================================================================
La foule contient            : 10 [humains]
L'âge moyen de la foule est  : 31.4 [années]
Le plus petit âge trouvé est : 11 [années]
Le plus grand âge trouvé est : 99 [années]
----------------------------------------------------------------------
Le contenu actuel de la liste est ci-dessous :
1) Fred âgé de 12 [années]
2) Jean âgé de 17 [années]
3) Paul âgé de 11 [années]
4) John âgé de 18 [années]
5) Philipp von Roll âgé de 33 [années]
6) Mac Haroni âgé de 22 [années]
7) John d'Oeuf âgé de 99 [années]
8) Alex Terrieur âgé de 23 [années]
9) Alain Terrieur âgé de 25 [années]
10) Paul âgé de 54 [années]
----------------------------------------------------------------------
La suppression de John d'Oeuf a : RÉUSSI !
----------------------------------------------------------------------
La foule contient           : 9 [humains]
L'âge moyen de la foule est : 23.88888888888889 [années]
Le plus petit âge trouvé est : 11 [années]
Le plus grand âge trouvé est : 54 [années]
----------------------------------------------------------------------
Le contenu actuel de la liste est ci-dessous :
1) Fred âgé de 12 [années]
2) Jean âgé de 17 [années]
3) Paul âgé de 11 [années]
4) John âgé de 18 [années]
5) Philipp von Roll âgé de 33 [années]
6) Mac Haroni âgé de 22 [années]
7) Alex Terrieur âgé de 23 [années]
8) Alain Terrieur âgé de 25 [années]
9) Paul âgé de 54 [années]
----------------------------------------------------------------------
La première position trouvée pour [Philipp von Roll] est  : 4
La dernière position trouvée pour [Philipp von Roll] est  : 4
----------------------------------------------------------------------
La première position trouvée pour [celui qu'on veut pas trouver] est  : -1
----------------------------------------------------------------------
Le premier humain trouvé avec le nom 'Paul' est âgé de : 11
Le dernier humain trouvé avec le nom 'Paul' est âgé de : 54
----------------------------------------------------------------------
Voici ci-dessous la liste de tous les prénoms (sans doublons) :
1) Fred
2) Jean
3) Paul
4) John
5) Philipp von Roll
6) Mac Haroni
7) Alex Terrieur
8) Alain Terrieur
```
*N.B. Attention : ce n'est pas parce que vous obtenez le résultat ci-dessus sur la console que vos méthodes sont irréprochables car le `main()`fourni ne teste pas toutes les possibilités.*
## RESTITUTION :
1. Rendre ce devoir normalement par `push` GitHub
