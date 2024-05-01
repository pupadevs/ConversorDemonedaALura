# Conversor de Monedas

Este proyecto es un conversor de monedas para el Challenge de Alura, que te permite convertir una cantidad de dinero de una moneda a otra utilizando las tasas de conversión proporcionadas por la API de ExchangeRate-API.

## Funcionalidades

- Convertir una cantidad de dinero de una moneda a otra.
- Ver una lista de códigos de moneda disponibles.

## Clases Principales

### CurrencyData

La clase `CurrencyData` representa los datos de la conversión de moneda. Contiene los siguientes atributos:

- `base_code`: El código de la moneda base.
- `target_code`: El código de la moneda de destino.
- `conversion_rate`: La tasa de conversión de la moneda base a la moneda de destino.
- `cantidad`: La cantidad de dinero a convertir.
- `formateddDouble`: La cantidad de dinero convertida formateada.

#### Métodos

- `setCantidad(Double cantidad)`: Establece la cantidad de dinero a convertir.
- `currencyConverter()`: Realiza la conversión de moneda.
- `toString()`: Devuelve una representación en forma de cadena de los datos de conversión.

### CodeRates

El enum `CodeRates` proporciona una lista de códigos de moneda y sus nombres completos asociados.

### CurrencyConverter

La clase `CurrencyConverter` implementa la interfaz `ConversionInterface` y se encarga de realizar la conversión de moneda y llamar a la API para obtener los datos de conversión.

### ToJson

La clase `ToJson` convierte la respuesta de la API en un objeto `CurrencyData`.

### MenuPrincipal

La clase `MenuPrincipal` proporciona un menú interactivo para que el usuario pueda realizar conversiones de moneda y ver la lista de códigos de moneda disponibles.

### Switch

La clase `Switch` maneja la lógica del menú interactivo y las conversiones de moneda.

### AmountNoValidException

La clase `AmountNoValidException` es una excepción personalizada que se lanza cuando se ingresa una cantidad no válida durante la conversión de moneda.

### ApiRequest

La clase `ApiRequest` se encarga de realizar la solicitud HTTP a la API de ExchangeRate-API para obtener las tasas de conversión de moneda.

## Uso

Para utilizar el conversor de monedas, ejecuta la clase `MenuPrincipal` y sigue las instrucciones en pantalla.

### Opciones del 1 al 4
#### 1. ![image](https://github.com/pupadevs/ConversorDemonedaALura/assets/121895258/f02ae90f-2712-4178-a44b-93bf10ea9b9f)

#### 2. ![image](https://github.com/pupadevs/ConversorDemonedaALura/assets/121895258/c07ca32a-1919-44dd-9ffc-6ff3e92a622b)

### 3. ![image](https://github.com/pupadevs/ConversorDemonedaALura/assets/121895258/b7e50eeb-2139-4888-bce1-d61550b38195)





Siéntete libre de contribuir al proyecto abriendo un problema o enviando una solicitud de extracción.

## Clonar el Repositorio

Puedes clonar el repositorio desde Git utilizando el siguiente comando:
git clone https://github.com/pupadevs/ConversorDemonedaALura



