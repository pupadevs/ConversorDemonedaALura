package com.conversor.app.service;

import java.util.ArrayList;
import java.util.List;

public enum CodeRates {
    USD("USD", "United States Dollar"),
    DOP("DOP", "Dominican Peso"),
    VEF("VEF", "Venezuelan Bolívar"),
    MXN("MXN", "Mexican Peso"),
    COP("COP", "Colombian Peso"),
    ARS("ARS", "Argentine Peso"),
    EUR("EUR", "Euro"),
    GBP("GBP", "British Pound"),
    JPY("JPY", "Japanese Yen"),
    AUD("AUD", "Australian Dollar"),
    CAD("CAD", "Canadian Dollar"),
    CHF("CHF", "Swiss Franc"),
    CNY("CNY", "Chinese Yuan"),
    SEK("SEK", "Swedish Krona"),
    NZD("NZD", "New Zealand Dollar"),
    NOK("NOK", "Norwegian Krone"),
    KRW("KRW", "South Korean Won"),
    INR("INR", "Indian Rupee"),
    RUB("RUB", "Russian Ruble"),
    BRL("BRL", "Brazilian Real"),
    TRY("TRY", "Turkish Lira"),
    SGD("SGD", "Singapore Dollar"),
    ZAR("ZAR", "South African Rand"),
    HKD("HKD", "Hong Kong Dollar"),
    PLN("PLN", "Polish Zloty"),
    THB("THB", "Thai Baht"),
    TWD("TWD", "Taiwanese Dollar"),
    IDR("IDR", "Indonesian Rupiah"),
    SAR("SAR", "Saudi Riyal"),
    AED("AED", "United Arab Emirates Dirham"),
    CLP("CLP", "Chilean Peso"),
    PEN("PEN", "Peruvian Sol"),
    PHP("PHP", "Philippine Peso"),
    HUF("HUF", "Hungarian Forint"),
    CZK("CZK", "Czech Koruna"),
    ILS("ILS", "Israeli Shekel"),
    DKK("DKK", "Danish Krone"),
    EGP("EGP", "Egyptian Pound"),
    MYR("MYR", "Malaysian Ringgit"),
    QAR("QAR", "Qatari Riyal"),
    CRC("CRC", "Costa Rican Colón"),
    NIO("NIO", "Nicaraguan Córdoba"),
    GTQ("GTQ", "Guatemalan Quetzal"),
    SVC("SVC", "Salvadoran Colón"),
    BMD("BMD", "Bermudian Dollar"),
    BZD("BZD", "Belize Dollar"),
    BOB("BOB", "Bolivian Boliviano"),
    PYG("PYG", "Paraguayan Guaraní"),
    UYU("UYU", "Uruguayan Peso"),
    UZS("UZS", "Uzbekistan Som"),
    AZN("AZN", "Azerbaijani Manat"),
    AWG("AWG", "Aruban Florin"),
    BHD("BHD", "Bahraini Dinar"),
    BWP("BWP", "Botswana Pula"),
    FJD("FJD", "Fijian Dollar"),
    GIP("GIP", "Gibraltar Pound"),
    JMD("JMD", "Jamaican Dollar"),
    JOD("JOD", "Jordanian Dinar"),
    KES("KES", "Kenyan Shilling"),
    KWD("KWD", "Kuwaiti Dinar"),
    LKR("LKR", "Sri Lankan Rupee"),
    MAD("MAD", "Moroccan Dirham"),
    MUR("MUR", "Mauritian Rupee"),
    OMR("OMR", "Omani Rial"),
    PGK("PGK", "Papua New Guinean Kina"),
    RSD("RSD", "Serbian Dinar"),
    SDG("SDG", "Sudanese Pound"),
    SRD("SRD", "Surinamese Dollar"),
    SZL("SZL", "Swazi Lilangeni"),
    TND("TND", "Tunisian Dinar"),
    TTD("TTD", "Trinidad and Tobago Dollar"),
    UGX("UGX", "Ugandan Shilling"),
    VUV("VUV", "Vanuatu Vatu"),
    WST("WST", "Samoan Tala"),
    XAF("XAF", "Central African CFA Franc"),
    XCD("XCD", "East Caribbean Dollar"),
    XOF("XOF", "West African CFA Franc"),
    XPF("XPF", "CFP Franc"),
    YER("YER", "Yemeni Rial"),
    ZMW("ZMW", "Zambian Kwacha");

    private final String code;
    private final String fullName;

    CodeRates(String code, String fullName) {
        this.code = code;
        this.fullName = fullName;
    }

    public String getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }
    public static List<String> getAllCodes() {
        int num= 1;
        List<String> allCodes = new ArrayList<>();
        for (CodeRates codeRate : CodeRates.values()) {
            allCodes.add( num +".-" + codeRate.getCode()+ " : " + codeRate.getFullName());
            num++;
        }
        return allCodes;
    }
}
