/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * </p>
 * <p>
 * The only supported feature is a holiday calendar. If you use the calendar, all data in the datasets should belong to
 * the same country as the calendar. For the holiday calendar data, see the <a
 * href="http://jollyday.sourceforge.net/data.html">Jollyday</a> web site.
 * </p>
 * <p>
 * India and Korea's holidays are not included in the Jollyday library, but both are supported by Amazon Forecast. Their
 * holidays are:
 * </p>
 * <p>
 * <b>"IN" - INDIA</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>JANUARY 26 - REPUBLIC DAY</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AUGUST 15 - INDEPENDENCE DAY</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>OCTOBER 2 GANDHI'S BIRTHDAY</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>"KR" - KOREA</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>JANUARY 1 - NEW YEAR</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>MARCH 1 - INDEPENDENCE MOVEMENT DAY</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>MAY 5 - CHILDREN'S DAY</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>JUNE 6 - MEMORIAL DAY</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AUGUST 15 - LIBERATION DAY</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>OCTOBER 3 - NATIONAL FOUNDATION DAY</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>OCTOBER 9 - HANGEUL DAY</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DECEMBER 25 - CHRISTMAS DAY</code>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/SupplementaryFeature" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SupplementaryFeature implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the feature. This must be "holiday".
     * </p>
     */
    private String name;
    /**
     * <p>
     * One of the following 2 letter country codes:
     * </p>
     * <ul>
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
     * "BE" - BELGIUM
     * </p>
     * </li>
     * <li>
     * <p>
     * "BR" - BRAZIL
     * </p>
     * </li>
     * <li>
     * <p>
     * "CA" - CANADA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CN" - CHINA
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
     * "HU" - HUNGARY
     * </p>
     * </li>
     * <li>
     * <p>
     * "IE" - IRELAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "IN" - INDIA
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
     * "KR" - KOREA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LU" - LUXEMBOURG
     * </p>
     * </li>
     * <li>
     * <p>
     * "MX" - MEXICO
     * </p>
     * </li>
     * <li>
     * <p>
     * "NL" - NETHERLANDS
     * </p>
     * </li>
     * <li>
     * <p>
     * "NO" - NORWAY
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
     * "RU" - RUSSIA
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
     * "US" - UNITED STATES
     * </p>
     * </li>
     * <li>
     * <p>
     * "UK" - UNITED KINGDOM
     * </p>
     * </li>
     * </ul>
     */
    private String value;

    /**
     * <p>
     * The name of the feature. This must be "holiday".
     * </p>
     * 
     * @param name
     *        The name of the feature. This must be "holiday".
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the feature. This must be "holiday".
     * </p>
     * 
     * @return The name of the feature. This must be "holiday".
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the feature. This must be "holiday".
     * </p>
     * 
     * @param name
     *        The name of the feature. This must be "holiday".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupplementaryFeature withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * One of the following 2 letter country codes:
     * </p>
     * <ul>
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
     * "BE" - BELGIUM
     * </p>
     * </li>
     * <li>
     * <p>
     * "BR" - BRAZIL
     * </p>
     * </li>
     * <li>
     * <p>
     * "CA" - CANADA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CN" - CHINA
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
     * "HU" - HUNGARY
     * </p>
     * </li>
     * <li>
     * <p>
     * "IE" - IRELAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "IN" - INDIA
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
     * "KR" - KOREA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LU" - LUXEMBOURG
     * </p>
     * </li>
     * <li>
     * <p>
     * "MX" - MEXICO
     * </p>
     * </li>
     * <li>
     * <p>
     * "NL" - NETHERLANDS
     * </p>
     * </li>
     * <li>
     * <p>
     * "NO" - NORWAY
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
     * "RU" - RUSSIA
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
     * "US" - UNITED STATES
     * </p>
     * </li>
     * <li>
     * <p>
     * "UK" - UNITED KINGDOM
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        One of the following 2 letter country codes:</p>
     *        <ul>
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
     *        "BE" - BELGIUM
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "BR" - BRAZIL
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CA" - CANADA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CN" - CHINA
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
     *        "HU" - HUNGARY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "IE" - IRELAND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "IN" - INDIA
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
     *        "KR" - KOREA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "LU" - LUXEMBOURG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "MX" - MEXICO
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NL" - NETHERLANDS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NO" - NORWAY
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
     *        "RU" - RUSSIA
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
     *        "US" - UNITED STATES
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "UK" - UNITED KINGDOM
     *        </p>
     *        </li>
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * One of the following 2 letter country codes:
     * </p>
     * <ul>
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
     * "BE" - BELGIUM
     * </p>
     * </li>
     * <li>
     * <p>
     * "BR" - BRAZIL
     * </p>
     * </li>
     * <li>
     * <p>
     * "CA" - CANADA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CN" - CHINA
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
     * "HU" - HUNGARY
     * </p>
     * </li>
     * <li>
     * <p>
     * "IE" - IRELAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "IN" - INDIA
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
     * "KR" - KOREA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LU" - LUXEMBOURG
     * </p>
     * </li>
     * <li>
     * <p>
     * "MX" - MEXICO
     * </p>
     * </li>
     * <li>
     * <p>
     * "NL" - NETHERLANDS
     * </p>
     * </li>
     * <li>
     * <p>
     * "NO" - NORWAY
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
     * "RU" - RUSSIA
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
     * "US" - UNITED STATES
     * </p>
     * </li>
     * <li>
     * <p>
     * "UK" - UNITED KINGDOM
     * </p>
     * </li>
     * </ul>
     * 
     * @return One of the following 2 letter country codes:</p>
     *         <ul>
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
     *         "BE" - BELGIUM
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "BR" - BRAZIL
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "CA" - CANADA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "CN" - CHINA
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
     *         "HU" - HUNGARY
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "IE" - IRELAND
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "IN" - INDIA
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
     *         "KR" - KOREA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "LU" - LUXEMBOURG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "MX" - MEXICO
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "NL" - NETHERLANDS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "NO" - NORWAY
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
     *         "RU" - RUSSIA
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
     *         "US" - UNITED STATES
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "UK" - UNITED KINGDOM
     *         </p>
     *         </li>
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * One of the following 2 letter country codes:
     * </p>
     * <ul>
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
     * "BE" - BELGIUM
     * </p>
     * </li>
     * <li>
     * <p>
     * "BR" - BRAZIL
     * </p>
     * </li>
     * <li>
     * <p>
     * "CA" - CANADA
     * </p>
     * </li>
     * <li>
     * <p>
     * "CN" - CHINA
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
     * "HU" - HUNGARY
     * </p>
     * </li>
     * <li>
     * <p>
     * "IE" - IRELAND
     * </p>
     * </li>
     * <li>
     * <p>
     * "IN" - INDIA
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
     * "KR" - KOREA
     * </p>
     * </li>
     * <li>
     * <p>
     * "LU" - LUXEMBOURG
     * </p>
     * </li>
     * <li>
     * <p>
     * "MX" - MEXICO
     * </p>
     * </li>
     * <li>
     * <p>
     * "NL" - NETHERLANDS
     * </p>
     * </li>
     * <li>
     * <p>
     * "NO" - NORWAY
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
     * "RU" - RUSSIA
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
     * "US" - UNITED STATES
     * </p>
     * </li>
     * <li>
     * <p>
     * "UK" - UNITED KINGDOM
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        One of the following 2 letter country codes:</p>
     *        <ul>
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
     *        "BE" - BELGIUM
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "BR" - BRAZIL
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CA" - CANADA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "CN" - CHINA
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
     *        "HU" - HUNGARY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "IE" - IRELAND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "IN" - INDIA
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
     *        "KR" - KOREA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "LU" - LUXEMBOURG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "MX" - MEXICO
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NL" - NETHERLANDS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "NO" - NORWAY
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
     *        "RU" - RUSSIA
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
     *        "US" - UNITED STATES
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "UK" - UNITED KINGDOM
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
