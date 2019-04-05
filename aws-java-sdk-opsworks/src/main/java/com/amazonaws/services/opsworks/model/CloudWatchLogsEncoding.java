/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import javax.annotation.Generated;

/**
 * <p>
 * Specifies the encoding of the log file so that the file can be read correctly. The default is <code>utf_8</code>.
 * Encodings supported by Python <code>codecs.decode()</code> can be used here.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CloudWatchLogsEncoding {

    Ascii("ascii"),
    Big5("big5"),
    Big5hkscs("big5hkscs"),
    Cp037("cp037"),
    Cp424("cp424"),
    Cp437("cp437"),
    Cp500("cp500"),
    Cp720("cp720"),
    Cp737("cp737"),
    Cp775("cp775"),
    Cp850("cp850"),
    Cp852("cp852"),
    Cp855("cp855"),
    Cp856("cp856"),
    Cp857("cp857"),
    Cp858("cp858"),
    Cp860("cp860"),
    Cp861("cp861"),
    Cp862("cp862"),
    Cp863("cp863"),
    Cp864("cp864"),
    Cp865("cp865"),
    Cp866("cp866"),
    Cp869("cp869"),
    Cp874("cp874"),
    Cp875("cp875"),
    Cp932("cp932"),
    Cp949("cp949"),
    Cp950("cp950"),
    Cp1006("cp1006"),
    Cp1026("cp1026"),
    Cp1140("cp1140"),
    Cp1250("cp1250"),
    Cp1251("cp1251"),
    Cp1252("cp1252"),
    Cp1253("cp1253"),
    Cp1254("cp1254"),
    Cp1255("cp1255"),
    Cp1256("cp1256"),
    Cp1257("cp1257"),
    Cp1258("cp1258"),
    Euc_jp("euc_jp"),
    Euc_jis_2004("euc_jis_2004"),
    Euc_jisx0213("euc_jisx0213"),
    Euc_kr("euc_kr"),
    Gb2312("gb2312"),
    Gbk("gbk"),
    Gb18030("gb18030"),
    Hz("hz"),
    Iso2022_jp("iso2022_jp"),
    Iso2022_jp_1("iso2022_jp_1"),
    Iso2022_jp_2("iso2022_jp_2"),
    Iso2022_jp_2004("iso2022_jp_2004"),
    Iso2022_jp_3("iso2022_jp_3"),
    Iso2022_jp_ext("iso2022_jp_ext"),
    Iso2022_kr("iso2022_kr"),
    Latin_1("latin_1"),
    Iso8859_2("iso8859_2"),
    Iso8859_3("iso8859_3"),
    Iso8859_4("iso8859_4"),
    Iso8859_5("iso8859_5"),
    Iso8859_6("iso8859_6"),
    Iso8859_7("iso8859_7"),
    Iso8859_8("iso8859_8"),
    Iso8859_9("iso8859_9"),
    Iso8859_10("iso8859_10"),
    Iso8859_13("iso8859_13"),
    Iso8859_14("iso8859_14"),
    Iso8859_15("iso8859_15"),
    Iso8859_16("iso8859_16"),
    Johab("johab"),
    Koi8_r("koi8_r"),
    Koi8_u("koi8_u"),
    Mac_cyrillic("mac_cyrillic"),
    Mac_greek("mac_greek"),
    Mac_iceland("mac_iceland"),
    Mac_latin2("mac_latin2"),
    Mac_roman("mac_roman"),
    Mac_turkish("mac_turkish"),
    Ptcp154("ptcp154"),
    Shift_jis("shift_jis"),
    Shift_jis_2004("shift_jis_2004"),
    Shift_jisx0213("shift_jisx0213"),
    Utf_32("utf_32"),
    Utf_32_be("utf_32_be"),
    Utf_32_le("utf_32_le"),
    Utf_16("utf_16"),
    Utf_16_be("utf_16_be"),
    Utf_16_le("utf_16_le"),
    Utf_7("utf_7"),
    Utf_8("utf_8"),
    Utf_8_sig("utf_8_sig");

    private String value;

    private CloudWatchLogsEncoding(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return CloudWatchLogsEncoding corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static CloudWatchLogsEncoding fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CloudWatchLogsEncoding enumEntry : CloudWatchLogsEncoding.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
