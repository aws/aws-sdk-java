/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a supplementary feature of a dataset group. This object is part of the <a>InputDataConfig</a> object.
 * Forecast supports the Weather Index and Holidays built-in featurizations.
 * </p>
 * <p>
 * <b>Weather Index</b>
 * </p>
 * <p>
 * The Amazon Forecast Weather Index is a built-in featurization that incorporates historical and projected weather
 * information into your model. The Weather Index supplements your datasets with over two years of historical weather
 * data and up to 14 days of projected weather data. For more information, see <a
 * href="https://docs.aws.amazon.com/forecast/latest/dg/weather.html">Amazon Forecast Weather Index</a>.
 * </p>
 * <p>
 * <b>Holidays</b>
 * </p>
 * <p>
 * Holidays is a built-in featurization that incorporates a feature-engineered dataset of national holiday information
 * into your model. It provides native support for the holiday calendars of 66 countries. To view the holiday calendars,
 * refer to the <a href="http://jollyday.sourceforge.net/data.html">Jollyday</a> library. For more information, see <a
 * href="https://docs.aws.amazon.com/forecast/latest/dg/holidays.html">Holidays Featurization</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/SupplementaryFeature" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SupplementaryFeature implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the feature. Valid values: <code>"holiday"</code> and <code>"weather"</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * <b>Weather Index</b>
     * </p>
     * <p>
     * To enable the Weather Index, set the value to <code>"true"</code>
     * </p>
     * <p>
     * <b>Holidays</b>
     * </p>
     * <p>
     * To enable Holidays, specify a country with one of the following two-letter country codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "AL" - ALBANIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "AR" - ARGENTINA
     * </p>
     * </li>
     * <li>
     * <p>
     * "AT" - AUSTRIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "AU" - AUSTRALIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BA" - BOSNIA HERZEGOVINA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BE" - BELGIUM
     * </p>
     * </li>
     * <li>
     * <p>
     * "BG" - BULGARIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BO" - BOLIVIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BR" - BRAZIL
     * </p>
     * </li>
     * <li>
     * <p>
     * "BY" - BELARUS
     * </p>
     * </li>
     * <li>
     * <p>
     * "CA" - CANADA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CL" - CHILE
     * </p>
     * </li>
     * <li>
     * <p>
     * "CO" - COLOMBIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CR" - COSTA RICA
     * </p>
     * </li>
     * <li>
     * <p>
     * "HR" - CROATIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CZ" - CZECH REPUBLIC
     * </p>
     * </li>
     * <li>
     * <p>
     * "DK" - DENMARK
     * </p>
     * </li>
     * <li>
     * <p>
     * "EC" - ECUADOR
     * </p>
     * </li>
     * <li>
     * <p>
     * "EE" - ESTONIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ET" - ETHIOPIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "FI" - FINLAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "FR" - FRANCE
     * </p>
     * </li>
     * <li>
     * <p>
     * "DE" - GERMANY
     * </p>
     * </li>
     * <li>
     * <p>
     * "GR" - GREECE
     * </p>
     * </li>
     * <li>
     * <p>
     * "HU" - HUNGARY
     * </p>
     * </li>
     * <li>
     * <p>
     * "IS" - ICELAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "IN" - INDIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "IE" - IRELAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "IT" - ITALY
     * </p>
     * </li>
     * <li>
     * <p>
     * "JP" - JAPAN
     * </p>
     * </li>
     * <li>
     * <p>
     * "KZ" - KAZAKHSTAN
     * </p>
     * </li>
     * <li>
     * <p>
     * "KR" - KOREA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LV" - LATVIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LI" - LIECHTENSTEIN
     * </p>
     * </li>
     * <li>
     * <p>
     * "LT" - LITHUANIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LU" - LUXEMBOURG
     * </p>
     * </li>
     * <li>
     * <p>
     * "MK" - MACEDONIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "MT" - MALTA
     * </p>
     * </li>
     * <li>
     * <p>
     * "MX" - MEXICO
     * </p>
     * </li>
     * <li>
     * <p>
     * "MD" - MOLDOVA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ME" - MONTENEGRO
     * </p>
     * </li>
     * <li>
     * <p>
     * "NL" - NETHERLANDS
     * </p>
     * </li>
     * <li>
     * <p>
     * "NZ" - NEW ZEALAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "NI" - NICARAGUA
     * </p>
     * </li>
     * <li>
     * <p>
     * "NG" - NIGERIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "NO" - NORWAY
     * </p>
     * </li>
     * <li>
     * <p>
     * "PA" - PANAMA
     * </p>
     * </li>
     * <li>
     * <p>
     * "PY" - PARAGUAY
     * </p>
     * </li>
     * <li>
     * <p>
     * "PE" - PERU
     * </p>
     * </li>
     * <li>
     * <p>
     * "PL" - POLAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "PT" - PORTUGAL
     * </p>
     * </li>
     * <li>
     * <p>
     * "RO" - ROMANIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "RU" - RUSSIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "RS" - SERBIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "SK" - SLOVAKIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "SI" - SLOVENIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ZA" - SOUTH AFRICA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ES" - SPAIN
     * </p>
     * </li>
     * <li>
     * <p>
     * "SE" - SWEDEN
     * </p>
     * </li>
     * <li>
     * <p>
     * "CH" - SWITZERLAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "UA" - UKRAINE
     * </p>
     * </li>
     * <li>
     * <p>
     * "AE" - UNITED ARAB EMIRATES
     * </p>
     * </li>
     * <li>
     * <p>
     * "US" - UNITED STATES
     * </p>
     * </li>
     * <li>
     * <p>
     * "UK" - UNITED KINGDOM
     * </p>
     * </li>
     * <li>
     * <p>
     * "UY" - URUGUAY
     * </p>
     * </li>
     * <li>
     * <p>
     * "VE" - VENEZUELA
     * </p>
     * </li>
     * </ul>
     */
    private String value;

    /**
     * <p>
     * The name of the feature. Valid values: <code>"holiday"</code> and <code>"weather"</code>.
     * </p>
     * 
     * @param name
     *        The name of the feature. Valid values: <code>"holiday"</code> and <code>"weather"</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the feature. Valid values: <code>"holiday"</code> and <code>"weather"</code>.
     * </p>
     * 
     * @return The name of the feature. Valid values: <code>"holiday"</code> and <code>"weather"</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the feature. Valid values: <code>"holiday"</code> and <code>"weather"</code>.
     * </p>
     * 
     * @param name
     *        The name of the feature. Valid values: <code>"holiday"</code> and <code>"weather"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupplementaryFeature withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * <b>Weather Index</b>
     * </p>
     * <p>
     * To enable the Weather Index, set the value to <code>"true"</code>
     * </p>
     * <p>
     * <b>Holidays</b>
     * </p>
     * <p>
     * To enable Holidays, specify a country with one of the following two-letter country codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "AL" - ALBANIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "AR" - ARGENTINA
     * </p>
     * </li>
     * <li>
     * <p>
     * "AT" - AUSTRIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "AU" - AUSTRALIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BA" - BOSNIA HERZEGOVINA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BE" - BELGIUM
     * </p>
     * </li>
     * <li>
     * <p>
     * "BG" - BULGARIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BO" - BOLIVIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BR" - BRAZIL
     * </p>
     * </li>
     * <li>
     * <p>
     * "BY" - BELARUS
     * </p>
     * </li>
     * <li>
     * <p>
     * "CA" - CANADA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CL" - CHILE
     * </p>
     * </li>
     * <li>
     * <p>
     * "CO" - COLOMBIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CR" - COSTA RICA
     * </p>
     * </li>
     * <li>
     * <p>
     * "HR" - CROATIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CZ" - CZECH REPUBLIC
     * </p>
     * </li>
     * <li>
     * <p>
     * "DK" - DENMARK
     * </p>
     * </li>
     * <li>
     * <p>
     * "EC" - ECUADOR
     * </p>
     * </li>
     * <li>
     * <p>
     * "EE" - ESTONIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ET" - ETHIOPIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "FI" - FINLAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "FR" - FRANCE
     * </p>
     * </li>
     * <li>
     * <p>
     * "DE" - GERMANY
     * </p>
     * </li>
     * <li>
     * <p>
     * "GR" - GREECE
     * </p>
     * </li>
     * <li>
     * <p>
     * "HU" - HUNGARY
     * </p>
     * </li>
     * <li>
     * <p>
     * "IS" - ICELAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "IN" - INDIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "IE" - IRELAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "IT" - ITALY
     * </p>
     * </li>
     * <li>
     * <p>
     * "JP" - JAPAN
     * </p>
     * </li>
     * <li>
     * <p>
     * "KZ" - KAZAKHSTAN
     * </p>
     * </li>
     * <li>
     * <p>
     * "KR" - KOREA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LV" - LATVIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LI" - LIECHTENSTEIN
     * </p>
     * </li>
     * <li>
     * <p>
     * "LT" - LITHUANIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LU" - LUXEMBOURG
     * </p>
     * </li>
     * <li>
     * <p>
     * "MK" - MACEDONIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "MT" - MALTA
     * </p>
     * </li>
     * <li>
     * <p>
     * "MX" - MEXICO
     * </p>
     * </li>
     * <li>
     * <p>
     * "MD" - MOLDOVA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ME" - MONTENEGRO
     * </p>
     * </li>
     * <li>
     * <p>
     * "NL" - NETHERLANDS
     * </p>
     * </li>
     * <li>
     * <p>
     * "NZ" - NEW ZEALAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "NI" - NICARAGUA
     * </p>
     * </li>
     * <li>
     * <p>
     * "NG" - NIGERIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "NO" - NORWAY
     * </p>
     * </li>
     * <li>
     * <p>
     * "PA" - PANAMA
     * </p>
     * </li>
     * <li>
     * <p>
     * "PY" - PARAGUAY
     * </p>
     * </li>
     * <li>
     * <p>
     * "PE" - PERU
     * </p>
     * </li>
     * <li>
     * <p>
     * "PL" - POLAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "PT" - PORTUGAL
     * </p>
     * </li>
     * <li>
     * <p>
     * "RO" - ROMANIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "RU" - RUSSIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "RS" - SERBIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "SK" - SLOVAKIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "SI" - SLOVENIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ZA" - SOUTH AFRICA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ES" - SPAIN
     * </p>
     * </li>
     * <li>
     * <p>
     * "SE" - SWEDEN
     * </p>
     * </li>
     * <li>
     * <p>
     * "CH" - SWITZERLAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "UA" - UKRAINE
     * </p>
     * </li>
     * <li>
     * <p>
     * "AE" - UNITED ARAB EMIRATES
     * </p>
     * </li>
     * <li>
     * <p>
     * "US" - UNITED STATES
     * </p>
     * </li>
     * <li>
     * <p>
     * "UK" - UNITED KINGDOM
     * </p>
     * </li>
     * <li>
     * <p>
     * "UY" - URUGUAY
     * </p>
     * </li>
     * <li>
     * <p>
     * "VE" - VENEZUELA
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        <b>Weather Index</b> </p>
     *        <p>
     *        To enable the Weather Index, set the value to <code>"true"</code>
     *        </p>
     *        <p>
     *        <b>Holidays</b>
     *        </p>
     *        <p>
     *        To enable Holidays, specify a country with one of the following two-letter country codes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "AL" - ALBANIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "AR" - ARGENTINA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "AT" - AUSTRIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "AU" - AUSTRALIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "BA" - BOSNIA HERZEGOVINA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "BE" - BELGIUM
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "BG" - BULGARIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "BO" - BOLIVIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "BR" - BRAZIL
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "BY" - BELARUS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CA" - CANADA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CL" - CHILE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CO" - COLOMBIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CR" - COSTA RICA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "HR" - CROATIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CZ" - CZECH REPUBLIC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "DK" - DENMARK
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "EC" - ECUADOR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "EE" - ESTONIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "ET" - ETHIOPIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "FI" - FINLAND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "FR" - FRANCE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "DE" - GERMANY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "GR" - GREECE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "HU" - HUNGARY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "IS" - ICELAND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "IN" - INDIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "IE" - IRELAND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "IT" - ITALY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "JP" - JAPAN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "KZ" - KAZAKHSTAN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "KR" - KOREA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "LV" - LATVIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "LI" - LIECHTENSTEIN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "LT" - LITHUANIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "LU" - LUXEMBOURG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "MK" - MACEDONIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "MT" - MALTA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "MX" - MEXICO
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "MD" - MOLDOVA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "ME" - MONTENEGRO
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NL" - NETHERLANDS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NZ" - NEW ZEALAND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NI" - NICARAGUA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NG" - NIGERIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NO" - NORWAY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "PA" - PANAMA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "PY" - PARAGUAY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "PE" - PERU
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "PL" - POLAND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "PT" - PORTUGAL
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "RO" - ROMANIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "RU" - RUSSIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "RS" - SERBIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "SK" - SLOVAKIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "SI" - SLOVENIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "ZA" - SOUTH AFRICA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "ES" - SPAIN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "SE" - SWEDEN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CH" - SWITZERLAND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "UA" - UKRAINE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "AE" - UNITED ARAB EMIRATES
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "US" - UNITED STATES
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "UK" - UNITED KINGDOM
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "UY" - URUGUAY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "VE" - VENEZUELA
     *        </p>
     *        </li>
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * <b>Weather Index</b>
     * </p>
     * <p>
     * To enable the Weather Index, set the value to <code>"true"</code>
     * </p>
     * <p>
     * <b>Holidays</b>
     * </p>
     * <p>
     * To enable Holidays, specify a country with one of the following two-letter country codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "AL" - ALBANIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "AR" - ARGENTINA
     * </p>
     * </li>
     * <li>
     * <p>
     * "AT" - AUSTRIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "AU" - AUSTRALIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BA" - BOSNIA HERZEGOVINA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BE" - BELGIUM
     * </p>
     * </li>
     * <li>
     * <p>
     * "BG" - BULGARIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BO" - BOLIVIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BR" - BRAZIL
     * </p>
     * </li>
     * <li>
     * <p>
     * "BY" - BELARUS
     * </p>
     * </li>
     * <li>
     * <p>
     * "CA" - CANADA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CL" - CHILE
     * </p>
     * </li>
     * <li>
     * <p>
     * "CO" - COLOMBIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CR" - COSTA RICA
     * </p>
     * </li>
     * <li>
     * <p>
     * "HR" - CROATIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CZ" - CZECH REPUBLIC
     * </p>
     * </li>
     * <li>
     * <p>
     * "DK" - DENMARK
     * </p>
     * </li>
     * <li>
     * <p>
     * "EC" - ECUADOR
     * </p>
     * </li>
     * <li>
     * <p>
     * "EE" - ESTONIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ET" - ETHIOPIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "FI" - FINLAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "FR" - FRANCE
     * </p>
     * </li>
     * <li>
     * <p>
     * "DE" - GERMANY
     * </p>
     * </li>
     * <li>
     * <p>
     * "GR" - GREECE
     * </p>
     * </li>
     * <li>
     * <p>
     * "HU" - HUNGARY
     * </p>
     * </li>
     * <li>
     * <p>
     * "IS" - ICELAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "IN" - INDIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "IE" - IRELAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "IT" - ITALY
     * </p>
     * </li>
     * <li>
     * <p>
     * "JP" - JAPAN
     * </p>
     * </li>
     * <li>
     * <p>
     * "KZ" - KAZAKHSTAN
     * </p>
     * </li>
     * <li>
     * <p>
     * "KR" - KOREA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LV" - LATVIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LI" - LIECHTENSTEIN
     * </p>
     * </li>
     * <li>
     * <p>
     * "LT" - LITHUANIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LU" - LUXEMBOURG
     * </p>
     * </li>
     * <li>
     * <p>
     * "MK" - MACEDONIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "MT" - MALTA
     * </p>
     * </li>
     * <li>
     * <p>
     * "MX" - MEXICO
     * </p>
     * </li>
     * <li>
     * <p>
     * "MD" - MOLDOVA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ME" - MONTENEGRO
     * </p>
     * </li>
     * <li>
     * <p>
     * "NL" - NETHERLANDS
     * </p>
     * </li>
     * <li>
     * <p>
     * "NZ" - NEW ZEALAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "NI" - NICARAGUA
     * </p>
     * </li>
     * <li>
     * <p>
     * "NG" - NIGERIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "NO" - NORWAY
     * </p>
     * </li>
     * <li>
     * <p>
     * "PA" - PANAMA
     * </p>
     * </li>
     * <li>
     * <p>
     * "PY" - PARAGUAY
     * </p>
     * </li>
     * <li>
     * <p>
     * "PE" - PERU
     * </p>
     * </li>
     * <li>
     * <p>
     * "PL" - POLAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "PT" - PORTUGAL
     * </p>
     * </li>
     * <li>
     * <p>
     * "RO" - ROMANIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "RU" - RUSSIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "RS" - SERBIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "SK" - SLOVAKIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "SI" - SLOVENIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ZA" - SOUTH AFRICA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ES" - SPAIN
     * </p>
     * </li>
     * <li>
     * <p>
     * "SE" - SWEDEN
     * </p>
     * </li>
     * <li>
     * <p>
     * "CH" - SWITZERLAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "UA" - UKRAINE
     * </p>
     * </li>
     * <li>
     * <p>
     * "AE" - UNITED ARAB EMIRATES
     * </p>
     * </li>
     * <li>
     * <p>
     * "US" - UNITED STATES
     * </p>
     * </li>
     * <li>
     * <p>
     * "UK" - UNITED KINGDOM
     * </p>
     * </li>
     * <li>
     * <p>
     * "UY" - URUGUAY
     * </p>
     * </li>
     * <li>
     * <p>
     * "VE" - VENEZUELA
     * </p>
     * </li>
     * </ul>
     * 
     * @return <b>Weather Index</b> </p>
     *         <p>
     *         To enable the Weather Index, set the value to <code>"true"</code>
     *         </p>
     *         <p>
     *         <b>Holidays</b>
     *         </p>
     *         <p>
     *         To enable Holidays, specify a country with one of the following two-letter country codes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         "AL" - ALBANIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "AR" - ARGENTINA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "AT" - AUSTRIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "AU" - AUSTRALIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "BA" - BOSNIA HERZEGOVINA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "BE" - BELGIUM
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "BG" - BULGARIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "BO" - BOLIVIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "BR" - BRAZIL
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "BY" - BELARUS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "CA" - CANADA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "CL" - CHILE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "CO" - COLOMBIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "CR" - COSTA RICA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "HR" - CROATIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "CZ" - CZECH REPUBLIC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "DK" - DENMARK
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "EC" - ECUADOR
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "EE" - ESTONIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "ET" - ETHIOPIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "FI" - FINLAND
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "FR" - FRANCE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "DE" - GERMANY
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "GR" - GREECE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "HU" - HUNGARY
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "IS" - ICELAND
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "IN" - INDIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "IE" - IRELAND
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "IT" - ITALY
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "JP" - JAPAN
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "KZ" - KAZAKHSTAN
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "KR" - KOREA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "LV" - LATVIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "LI" - LIECHTENSTEIN
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "LT" - LITHUANIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "LU" - LUXEMBOURG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "MK" - MACEDONIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "MT" - MALTA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "MX" - MEXICO
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "MD" - MOLDOVA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "ME" - MONTENEGRO
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "NL" - NETHERLANDS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "NZ" - NEW ZEALAND
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "NI" - NICARAGUA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "NG" - NIGERIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "NO" - NORWAY
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "PA" - PANAMA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "PY" - PARAGUAY
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "PE" - PERU
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "PL" - POLAND
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "PT" - PORTUGAL
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "RO" - ROMANIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "RU" - RUSSIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "RS" - SERBIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "SK" - SLOVAKIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "SI" - SLOVENIA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "ZA" - SOUTH AFRICA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "ES" - SPAIN
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "SE" - SWEDEN
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "CH" - SWITZERLAND
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "UA" - UKRAINE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "AE" - UNITED ARAB EMIRATES
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "US" - UNITED STATES
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "UK" - UNITED KINGDOM
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "UY" - URUGUAY
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "VE" - VENEZUELA
     *         </p>
     *         </li>
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * <b>Weather Index</b>
     * </p>
     * <p>
     * To enable the Weather Index, set the value to <code>"true"</code>
     * </p>
     * <p>
     * <b>Holidays</b>
     * </p>
     * <p>
     * To enable Holidays, specify a country with one of the following two-letter country codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "AL" - ALBANIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "AR" - ARGENTINA
     * </p>
     * </li>
     * <li>
     * <p>
     * "AT" - AUSTRIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "AU" - AUSTRALIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BA" - BOSNIA HERZEGOVINA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BE" - BELGIUM
     * </p>
     * </li>
     * <li>
     * <p>
     * "BG" - BULGARIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BO" - BOLIVIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "BR" - BRAZIL
     * </p>
     * </li>
     * <li>
     * <p>
     * "BY" - BELARUS
     * </p>
     * </li>
     * <li>
     * <p>
     * "CA" - CANADA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CL" - CHILE
     * </p>
     * </li>
     * <li>
     * <p>
     * "CO" - COLOMBIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CR" - COSTA RICA
     * </p>
     * </li>
     * <li>
     * <p>
     * "HR" - CROATIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CZ" - CZECH REPUBLIC
     * </p>
     * </li>
     * <li>
     * <p>
     * "DK" - DENMARK
     * </p>
     * </li>
     * <li>
     * <p>
     * "EC" - ECUADOR
     * </p>
     * </li>
     * <li>
     * <p>
     * "EE" - ESTONIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ET" - ETHIOPIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "FI" - FINLAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "FR" - FRANCE
     * </p>
     * </li>
     * <li>
     * <p>
     * "DE" - GERMANY
     * </p>
     * </li>
     * <li>
     * <p>
     * "GR" - GREECE
     * </p>
     * </li>
     * <li>
     * <p>
     * "HU" - HUNGARY
     * </p>
     * </li>
     * <li>
     * <p>
     * "IS" - ICELAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "IN" - INDIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "IE" - IRELAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "IT" - ITALY
     * </p>
     * </li>
     * <li>
     * <p>
     * "JP" - JAPAN
     * </p>
     * </li>
     * <li>
     * <p>
     * "KZ" - KAZAKHSTAN
     * </p>
     * </li>
     * <li>
     * <p>
     * "KR" - KOREA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LV" - LATVIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LI" - LIECHTENSTEIN
     * </p>
     * </li>
     * <li>
     * <p>
     * "LT" - LITHUANIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LU" - LUXEMBOURG
     * </p>
     * </li>
     * <li>
     * <p>
     * "MK" - MACEDONIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "MT" - MALTA
     * </p>
     * </li>
     * <li>
     * <p>
     * "MX" - MEXICO
     * </p>
     * </li>
     * <li>
     * <p>
     * "MD" - MOLDOVA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ME" - MONTENEGRO
     * </p>
     * </li>
     * <li>
     * <p>
     * "NL" - NETHERLANDS
     * </p>
     * </li>
     * <li>
     * <p>
     * "NZ" - NEW ZEALAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "NI" - NICARAGUA
     * </p>
     * </li>
     * <li>
     * <p>
     * "NG" - NIGERIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "NO" - NORWAY
     * </p>
     * </li>
     * <li>
     * <p>
     * "PA" - PANAMA
     * </p>
     * </li>
     * <li>
     * <p>
     * "PY" - PARAGUAY
     * </p>
     * </li>
     * <li>
     * <p>
     * "PE" - PERU
     * </p>
     * </li>
     * <li>
     * <p>
     * "PL" - POLAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "PT" - PORTUGAL
     * </p>
     * </li>
     * <li>
     * <p>
     * "RO" - ROMANIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "RU" - RUSSIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "RS" - SERBIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "SK" - SLOVAKIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "SI" - SLOVENIA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ZA" - SOUTH AFRICA
     * </p>
     * </li>
     * <li>
     * <p>
     * "ES" - SPAIN
     * </p>
     * </li>
     * <li>
     * <p>
     * "SE" - SWEDEN
     * </p>
     * </li>
     * <li>
     * <p>
     * "CH" - SWITZERLAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "UA" - UKRAINE
     * </p>
     * </li>
     * <li>
     * <p>
     * "AE" - UNITED ARAB EMIRATES
     * </p>
     * </li>
     * <li>
     * <p>
     * "US" - UNITED STATES
     * </p>
     * </li>
     * <li>
     * <p>
     * "UK" - UNITED KINGDOM
     * </p>
     * </li>
     * <li>
     * <p>
     * "UY" - URUGUAY
     * </p>
     * </li>
     * <li>
     * <p>
     * "VE" - VENEZUELA
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        <b>Weather Index</b> </p>
     *        <p>
     *        To enable the Weather Index, set the value to <code>"true"</code>
     *        </p>
     *        <p>
     *        <b>Holidays</b>
     *        </p>
     *        <p>
     *        To enable Holidays, specify a country with one of the following two-letter country codes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "AL" - ALBANIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "AR" - ARGENTINA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "AT" - AUSTRIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "AU" - AUSTRALIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "BA" - BOSNIA HERZEGOVINA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "BE" - BELGIUM
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "BG" - BULGARIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "BO" - BOLIVIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "BR" - BRAZIL
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "BY" - BELARUS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CA" - CANADA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CL" - CHILE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CO" - COLOMBIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CR" - COSTA RICA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "HR" - CROATIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CZ" - CZECH REPUBLIC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "DK" - DENMARK
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "EC" - ECUADOR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "EE" - ESTONIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "ET" - ETHIOPIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "FI" - FINLAND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "FR" - FRANCE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "DE" - GERMANY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "GR" - GREECE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "HU" - HUNGARY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "IS" - ICELAND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "IN" - INDIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "IE" - IRELAND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "IT" - ITALY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "JP" - JAPAN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "KZ" - KAZAKHSTAN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "KR" - KOREA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "LV" - LATVIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "LI" - LIECHTENSTEIN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "LT" - LITHUANIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "LU" - LUXEMBOURG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "MK" - MACEDONIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "MT" - MALTA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "MX" - MEXICO
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "MD" - MOLDOVA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "ME" - MONTENEGRO
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NL" - NETHERLANDS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NZ" - NEW ZEALAND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NI" - NICARAGUA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NG" - NIGERIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NO" - NORWAY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "PA" - PANAMA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "PY" - PARAGUAY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "PE" - PERU
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "PL" - POLAND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "PT" - PORTUGAL
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "RO" - ROMANIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "RU" - RUSSIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "RS" - SERBIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "SK" - SLOVAKIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "SI" - SLOVENIA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "ZA" - SOUTH AFRICA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "ES" - SPAIN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "SE" - SWEDEN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CH" - SWITZERLAND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "UA" - UKRAINE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "AE" - UNITED ARAB EMIRATES
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "US" - UNITED STATES
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "UK" - UNITED KINGDOM
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "UY" - URUGUAY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "VE" - VENEZUELA
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupplementaryFeature withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SupplementaryFeature == false)
            return false;
        SupplementaryFeature other = (SupplementaryFeature) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public SupplementaryFeature clone() {
        try {
            return (SupplementaryFeature) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.SupplementaryFeatureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
