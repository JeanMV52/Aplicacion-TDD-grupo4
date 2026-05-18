# TEST DRIVEN DEVELOPMENT (TDD) APLICADO A PDCA
## INTEGRANTES
Leonardo Andrade, Elizabeth Guerrón, Martin Jimenez, Jean Luc Morales, Mathias Vera

## LINK DEL VIDEO
https://udlaec-my.sharepoint.com/:v:/g/personal/mathias_vera_udla_edu_ec/IQBkj1Z7awBzQbLNNXZS-JwYAdIVA0bCFmxjRK0-J9cx4rk?e=dGMNHt&nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZy1MaW5rIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXcifX0%3D

## CICLO PDCA
- Plan (Plan): Realizar una función verificable a través de pruebas unitarias.
- Hacer (Do): Prueba unitaria que define el comportamiento esperado de la funcionalidad.
- Verificar (Check): Ejecución de la prueba, si falla, se verifica el motivo y se ajusta el código.
- Actuar (Act): Refactorización y ajuste del código para mejorar su calidad o para permitir nuevas pruebas. Si pasa la prueba, seguir a la siguiente funcionalidad.

## FUNCIONES DE VALIDACION DE CONTRASEÑAS

El proyecto cuenta con la clase `ValidadorContrasena`, la cual implementa los siguientes métodos de validación pública de forma robusta (con protección integrada contra valores nulos `null`):

| Función | Descripción |
| :--- | :--- |
| `esLongitudValida(String)` | Verifica que la contraseña tenga una longitud mínima de **8 caracteres**. |
| `contieneNumero(String)` | Evalúa mediante expresiones regulares que la contraseña posea al menos **un dígito numérico**. |
| `contieneMayuscula(String)` | Comprueba que exista al menos **una letra mayúscula** dentro de la cadena. |
| `contieneMinuscula(String)` | Asegura que la contraseña contenga al menos **una letra minúscula**. |
| `contieneCaracterEspecial(String)` | Verifica la presencia de al menos **un carácter especial** usando el patrón: `.*[@#!$%^&*(),.?":{}|<>].*` |

### Estado de las Pruebas Unitarias (JUnit 5)

Siguiendo la metodología **Test Driven Development (TDD)** acoplada al ciclo **PDCA**, se desarrollaron los casos de prueba para cada una de las funciones descritas, primero planteando la planificación (Plan), implementando el código (Do), haciendo la verificación (Check) y por último siguiendo al siguiente ciclo o mejora (Assert). 

> 🚀 **Resultado actual:** La suite completa de pruebas unitarias en `ValidadorContrasenaTest` ha sido ejecutada de manera exitosa. Todas las pruebas pasaron satisfactoriamente (**100% Green**), garantizando que los criterios de aceptación y la resistencia a regresiones se cumplen por completo.
