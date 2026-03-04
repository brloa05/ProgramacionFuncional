# 📄 Requerimientos del Sistema

## 1. Lista general de requerimientos

El sistema de Bankify tiene los siguientes requerimientos (descripción a alto nivel):

### 1.1 Requerimientos funcionales



### 2.2 Requerimiento Funcional 2

| Campo | Descripción |
|------|-------------|
| **ID** | RF-04 |
| **Nombre del requerimiento** | Creación y Administración de Equipos |
| **Descripción** | *El sistema debe permitir al Capitán crear y configurar un equipo (nombre, escudo y colores), invitar jugadores, gestionar alineaciones y validar que el equipo cumpla las reglas establecidas: mínimo 7 y máximo 12 jugadores y que un jugador no pertenezca a dos equipos, que más de la mitad pertenezcan a los programas autorizados (Ingeniería de Sistemas, Inteligencia Artificial, Ciberseguridad y Estadística), y que no se permitan cambios de jugadores durante el torneo.* |
| **Precondiciones** | *El sistema debe contar con un Capitán autenticado, un equipo previamente creado, jugadores registrados y un torneo en estado de inscripciones abiertas, asegurando además que el jugador no pertenezca a otro equipo.* |
| **Actor** | *Capitán* |
| **Flujo principal** | 1. El capitán crea un equipo.<br>2. Ingresa nombre, escudo y colores.<br>3. Invita jugadores.<br>4. El sistema valida límites y reglas.<br>5. El sistema confirma equipo válido. |
| **Diagrama de caso de uso** | *imagen y link*|
| **Poscondiciones** | *Se espera como resultado que el equipo quede registrado cumpliendo las reglas establecidas.* |

### 2.3 Requerimiento Funcional 3

| Campo | Descripción |
|------|-------------|
| **ID** | RF-05 |
| **Nombre del requerimiento** | Gestión de Invitaciones |
| **Descripción** | *El sistema debe permitir el envío de invitaciones a jugadores por parte del Capitán, así como la aceptación o rechazo de estas invitaciones por parte del jugador, garantizando asi que un jugador solo quede en un único equipo durante el torneo.* |
| **Precondiciones** | *El sistema debe contar con un Capitán autenticado, un equipo previamente creado, jugadores registrados y un torneo en estado de inscripciones abiertas, asegurando además que el jugador no pertenezca a otro equipo.* |
| **Actor** | *Capitán (principal) Jugador (secundario)* |
| **Flujo principal** | 1. El capitán envía invitación.<br>2. El jugador recibe notificación.<br>3. El jugador acepta o rechaza.<br>4. El sistema actualiza el estado del equipo. |
| **Diagrama de caso de uso** | *imagen y link*|
| **Poscondiciones** | *Se espera como resultado que el jugador quede vinculado o no al equipo según su decisión.* |


| Campo | Descripción |
|------|-------------|
| **ID** | RF-06 |
| **Nombre del requerimiento** | Búsqueda de Jugadores |
| **Descripción** | *El sistema debe permitir buscar jugadores aplicando filtros por posición, semestre, edad, género, nombre e identificación, mostrando como resultado la lista de jugadores que coincidan con los criterios ingresados* |
| **Precondiciones** | *El sistema debe tener jugadores previamente registrados con su información deportiva completa y un usuario autenticado con permisos para realizar búsquedas.* |
| **Actor** | *Capitán* |
| **Flujo principal** | 1. El capitán accede al módulo de búsqueda.<br>2. Ingresa filtros.<br>3. El sistema muestra resultados coincidentes. |
| **Diagrama de caso de uso** | *imagen y link*|
| **Poscondiciones** | *Se espera como resultado que se muestra la lista filtrada de jugadores disponibles.* |

## 3. Preguntas
