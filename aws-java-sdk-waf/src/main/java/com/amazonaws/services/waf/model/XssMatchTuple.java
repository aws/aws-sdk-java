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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the part of a web request that you want AWS WAF to inspect for cross-site scripting attacks and, if you
 * want AWS WAF to inspect a header, the name of the header.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/XssMatchTuple" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XssMatchTuple implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies where in a web request to look for cross-site scripting attacks.
     * </p>
     */
    private FieldToMatch fieldToMatch;
    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on <code>FieldToMatch</code>
     * before inspecting a request for a match.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system command line command and using unusual
     * formatting to disguise some or all of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: \ " ' ^
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: / (
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: , ;
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace multiple spaces with one space
     * </p>
     * </li>
     * <li>
     * <p>
     * Convert uppercase letters (A-Z) to lowercase (a-z)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * \f, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * \t, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * \n, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * \r, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * \v, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded characters. <code>HTML_ENTITY_DECODE</code>
     * performs the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Replaces <code>(ampersand)quot;</code> with <code>"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>LOWERCASE</b>
     * </p>
     * <p>
     * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>URL_DECODE</b>
     * </p>
     * <p>
     * Use this option to decode a URL-encoded value.
     * </p>
     * <p>
     * <b>NONE</b>
     * </p>
     * <p>
     * Specify <code>NONE</code> if you don't want to perform any text transformations.
     * </p>
     */
    private String textTransformation;

    /**
     * <p>
     * Specifies where in a web request to look for cross-site scripting attacks.
     * </p>
     * 
     * @param fieldToMatch
     *        Specifies where in a web request to look for cross-site scripting attacks.
     */

    public void setFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
    }

    /**
     * <p>
     * Specifies where in a web request to look for cross-site scripting attacks.
     * </p>
     * 
     * @return Specifies where in a web request to look for cross-site scripting attacks.
     */

    public FieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * <p>
     * Specifies where in a web request to look for cross-site scripting attacks.
     * </p>
     * 
     * @param fieldToMatch
     *        Specifies where in a web request to look for cross-site scripting attacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XssMatchTuple withFieldToMatch(FieldToMatch fieldToMatch) {
        setFieldToMatch(fieldToMatch);
        return this;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on <code>FieldToMatch</code>
     * before inspecting a request for a match.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system command line command and using unusual
     * formatting to disguise some or all of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: \ " ' ^
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: / (
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: , ;
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace multiple spaces with one space
     * </p>
     * </li>
     * <li>
     * <p>
     * Convert uppercase letters (A-Z) to lowercase (a-z)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * \f, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * \t, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * \n, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * \r, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * \v, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded characters. <code>HTML_ENTITY_DECODE</code>
     * performs the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Replaces <code>(ampersand)quot;</code> with <code>"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>LOWERCASE</b>
     * </p>
     * <p>
     * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>URL_DECODE</b>
     * </p>
     * <p>
     * Use this option to decode a URL-encoded value.
     * </p>
     * <p>
     * <b>NONE</b>
     * </p>
     * <p>
     * Specify <code>NONE</code> if you don't want to perform any text transformations.
     * </p>
     * 
     * @param textTransformation
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on
     *        <code>FieldToMatch</code> before inspecting a request for a match.</p>
     *        <p>
     *        You can only specify a single type of TextTransformation.
     *        </p>
     *        <p>
     *        <b>CMD_LINE</b>
     *        </p>
     *        <p>
     *        When you're concerned that attackers are injecting an operating system command line command and using
     *        unusual formatting to disguise some or all of the command, use this option to perform the following
     *        transformations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Delete the following characters: \ " ' ^
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delete spaces before the following characters: / (
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace the following characters with a space: , ;
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace multiple spaces with one space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Convert uppercase letters (A-Z) to lowercase (a-z)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>COMPRESS_WHITE_SPACE</b>
     *        </p>
     *        <p>
     *        Use this option to replace the following characters with a space character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        \f, formfeed, decimal 12
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \t, tab, decimal 9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \n, newline, decimal 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \r, carriage return, decimal 13
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \v, vertical tab, decimal 11
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to replace HTML-encoded characters with unencoded characters.
     *        <code>HTML_ENTITY_DECODE</code> performs the following operations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)quot;</code> with <code>"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>LOWERCASE</b>
     *        </p>
     *        <p>
     *        Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     *        </p>
     *        <p>
     *        <b>URL_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to decode a URL-encoded value.
     *        </p>
     *        <p>
     *        <b>NONE</b>
     *        </p>
     *        <p>
     *        Specify <code>NONE</code> if you don't want to perform any text transformations.
     * @see TextTransformation
     */

    public void setTextTransformation(String textTransformation) {
        this.textTransformation = textTransformation;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on <code>FieldToMatch</code>
     * before inspecting a request for a match.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system command line command and using unusual
     * formatting to disguise some or all of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: \ " ' ^
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: / (
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: , ;
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace multiple spaces with one space
     * </p>
     * </li>
     * <li>
     * <p>
     * Convert uppercase letters (A-Z) to lowercase (a-z)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * \f, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * \t, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * \n, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * \r, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * \v, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded characters. <code>HTML_ENTITY_DECODE</code>
     * performs the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Replaces <code>(ampersand)quot;</code> with <code>"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>LOWERCASE</b>
     * </p>
     * <p>
     * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>URL_DECODE</b>
     * </p>
     * <p>
     * Use this option to decode a URL-encoded value.
     * </p>
     * <p>
     * <b>NONE</b>
     * </p>
     * <p>
     * Specify <code>NONE</code> if you don't want to perform any text transformations.
     * </p>
     * 
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *         effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on
     *         <code>FieldToMatch</code> before inspecting a request for a match.</p>
     *         <p>
     *         You can only specify a single type of TextTransformation.
     *         </p>
     *         <p>
     *         <b>CMD_LINE</b>
     *         </p>
     *         <p>
     *         When you're concerned that attackers are injecting an operating system command line command and using
     *         unusual formatting to disguise some or all of the command, use this option to perform the following
     *         transformations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Delete the following characters: \ " ' ^
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delete spaces before the following characters: / (
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replace the following characters with a space: , ;
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replace multiple spaces with one space
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Convert uppercase letters (A-Z) to lowercase (a-z)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>COMPRESS_WHITE_SPACE</b>
     *         </p>
     *         <p>
     *         Use this option to replace the following characters with a space character (decimal 32):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         \f, formfeed, decimal 12
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         \t, tab, decimal 9
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         \n, newline, decimal 10
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         \r, carriage return, decimal 13
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         \v, vertical tab, decimal 11
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         non-breaking space, decimal 160
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     *         </p>
     *         <p>
     *         <b>HTML_ENTITY_DECODE</b>
     *         </p>
     *         <p>
     *         Use this option to replace HTML-encoded characters with unencoded characters.
     *         <code>HTML_ENTITY_DECODE</code> performs the following operations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Replaces <code>(ampersand)quot;</code> with <code>"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     *         corresponding characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     *         corresponding characters
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>LOWERCASE</b>
     *         </p>
     *         <p>
     *         Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     *         </p>
     *         <p>
     *         <b>URL_DECODE</b>
     *         </p>
     *         <p>
     *         Use this option to decode a URL-encoded value.
     *         </p>
     *         <p>
     *         <b>NONE</b>
     *         </p>
     *         <p>
     *         Specify <code>NONE</code> if you don't want to perform any text transformations.
     * @see TextTransformation
     */

    public String getTextTransformation() {
        return this.textTransformation;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on <code>FieldToMatch</code>
     * before inspecting a request for a match.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system command line command and using unusual
     * formatting to disguise some or all of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: \ " ' ^
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: / (
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: , ;
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace multiple spaces with one space
     * </p>
     * </li>
     * <li>
     * <p>
     * Convert uppercase letters (A-Z) to lowercase (a-z)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * \f, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * \t, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * \n, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * \r, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * \v, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded characters. <code>HTML_ENTITY_DECODE</code>
     * performs the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Replaces <code>(ampersand)quot;</code> with <code>"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>LOWERCASE</b>
     * </p>
     * <p>
     * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>URL_DECODE</b>
     * </p>
     * <p>
     * Use this option to decode a URL-encoded value.
     * </p>
     * <p>
     * <b>NONE</b>
     * </p>
     * <p>
     * Specify <code>NONE</code> if you don't want to perform any text transformations.
     * </p>
     * 
     * @param textTransformation
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on
     *        <code>FieldToMatch</code> before inspecting a request for a match.</p>
     *        <p>
     *        You can only specify a single type of TextTransformation.
     *        </p>
     *        <p>
     *        <b>CMD_LINE</b>
     *        </p>
     *        <p>
     *        When you're concerned that attackers are injecting an operating system command line command and using
     *        unusual formatting to disguise some or all of the command, use this option to perform the following
     *        transformations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Delete the following characters: \ " ' ^
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delete spaces before the following characters: / (
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace the following characters with a space: , ;
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace multiple spaces with one space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Convert uppercase letters (A-Z) to lowercase (a-z)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>COMPRESS_WHITE_SPACE</b>
     *        </p>
     *        <p>
     *        Use this option to replace the following characters with a space character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        \f, formfeed, decimal 12
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \t, tab, decimal 9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \n, newline, decimal 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \r, carriage return, decimal 13
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \v, vertical tab, decimal 11
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to replace HTML-encoded characters with unencoded characters.
     *        <code>HTML_ENTITY_DECODE</code> performs the following operations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)quot;</code> with <code>"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>LOWERCASE</b>
     *        </p>
     *        <p>
     *        Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     *        </p>
     *        <p>
     *        <b>URL_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to decode a URL-encoded value.
     *        </p>
     *        <p>
     *        <b>NONE</b>
     *        </p>
     *        <p>
     *        Specify <code>NONE</code> if you don't want to perform any text transformations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextTransformation
     */

    public XssMatchTuple withTextTransformation(String textTransformation) {
        setTextTransformation(textTransformation);
        return this;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on <code>FieldToMatch</code>
     * before inspecting a request for a match.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system command line command and using unusual
     * formatting to disguise some or all of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: \ " ' ^
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: / (
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: , ;
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace multiple spaces with one space
     * </p>
     * </li>
     * <li>
     * <p>
     * Convert uppercase letters (A-Z) to lowercase (a-z)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * \f, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * \t, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * \n, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * \r, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * \v, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded characters. <code>HTML_ENTITY_DECODE</code>
     * performs the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Replaces <code>(ampersand)quot;</code> with <code>"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>LOWERCASE</b>
     * </p>
     * <p>
     * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>URL_DECODE</b>
     * </p>
     * <p>
     * Use this option to decode a URL-encoded value.
     * </p>
     * <p>
     * <b>NONE</b>
     * </p>
     * <p>
     * Specify <code>NONE</code> if you don't want to perform any text transformations.
     * </p>
     * 
     * @param textTransformation
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on
     *        <code>FieldToMatch</code> before inspecting a request for a match.</p>
     *        <p>
     *        You can only specify a single type of TextTransformation.
     *        </p>
     *        <p>
     *        <b>CMD_LINE</b>
     *        </p>
     *        <p>
     *        When you're concerned that attackers are injecting an operating system command line command and using
     *        unusual formatting to disguise some or all of the command, use this option to perform the following
     *        transformations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Delete the following characters: \ " ' ^
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delete spaces before the following characters: / (
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace the following characters with a space: , ;
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace multiple spaces with one space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Convert uppercase letters (A-Z) to lowercase (a-z)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>COMPRESS_WHITE_SPACE</b>
     *        </p>
     *        <p>
     *        Use this option to replace the following characters with a space character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        \f, formfeed, decimal 12
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \t, tab, decimal 9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \n, newline, decimal 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \r, carriage return, decimal 13
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \v, vertical tab, decimal 11
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to replace HTML-encoded characters with unencoded characters.
     *        <code>HTML_ENTITY_DECODE</code> performs the following operations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)quot;</code> with <code>"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>LOWERCASE</b>
     *        </p>
     *        <p>
     *        Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     *        </p>
     *        <p>
     *        <b>URL_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to decode a URL-encoded value.
     *        </p>
     *        <p>
     *        <b>NONE</b>
     *        </p>
     *        <p>
     *        Specify <code>NONE</code> if you don't want to perform any text transformations.
     * @see TextTransformation
     */

    public void setTextTransformation(TextTransformation textTransformation) {
        withTextTransformation(textTransformation);
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on <code>FieldToMatch</code>
     * before inspecting a request for a match.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system command line command and using unusual
     * formatting to disguise some or all of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: \ " ' ^
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: / (
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: , ;
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace multiple spaces with one space
     * </p>
     * </li>
     * <li>
     * <p>
     * Convert uppercase letters (A-Z) to lowercase (a-z)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * \f, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * \t, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * \n, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * \r, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * \v, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded characters. <code>HTML_ENTITY_DECODE</code>
     * performs the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Replaces <code>(ampersand)quot;</code> with <code>"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>LOWERCASE</b>
     * </p>
     * <p>
     * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>URL_DECODE</b>
     * </p>
     * <p>
     * Use this option to decode a URL-encoded value.
     * </p>
     * <p>
     * <b>NONE</b>
     * </p>
     * <p>
     * Specify <code>NONE</code> if you don't want to perform any text transformations.
     * </p>
     * 
     * @param textTransformation
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on
     *        <code>FieldToMatch</code> before inspecting a request for a match.</p>
     *        <p>
     *        You can only specify a single type of TextTransformation.
     *        </p>
     *        <p>
     *        <b>CMD_LINE</b>
     *        </p>
     *        <p>
     *        When you're concerned that attackers are injecting an operating system command line command and using
     *        unusual formatting to disguise some or all of the command, use this option to perform the following
     *        transformations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Delete the following characters: \ " ' ^
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delete spaces before the following characters: / (
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace the following characters with a space: , ;
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace multiple spaces with one space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Convert uppercase letters (A-Z) to lowercase (a-z)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>COMPRESS_WHITE_SPACE</b>
     *        </p>
     *        <p>
     *        Use this option to replace the following characters with a space character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        \f, formfeed, decimal 12
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \t, tab, decimal 9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \n, newline, decimal 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \r, carriage return, decimal 13
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \v, vertical tab, decimal 11
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to replace HTML-encoded characters with unencoded characters.
     *        <code>HTML_ENTITY_DECODE</code> performs the following operations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)quot;</code> with <code>"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>LOWERCASE</b>
     *        </p>
     *        <p>
     *        Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     *        </p>
     *        <p>
     *        <b>URL_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to decode a URL-encoded value.
     *        </p>
     *        <p>
     *        <b>NONE</b>
     *        </p>
     *        <p>
     *        Specify <code>NONE</code> if you don't want to perform any text transformations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextTransformation
     */

    public XssMatchTuple withTextTransformation(TextTransformation textTransformation) {
        this.textTransformation = textTransformation.toString();
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
        if (getFieldToMatch() != null)
            sb.append("FieldToMatch: ").append(getFieldToMatch()).append(",");
        if (getTextTransformation() != null)
            sb.append("TextTransformation: ").append(getTextTransformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof XssMatchTuple == false)
            return false;
        XssMatchTuple other = (XssMatchTuple) obj;
        if (other.getFieldToMatch() == null ^ this.getFieldToMatch() == null)
            return false;
        if (other.getFieldToMatch() != null && other.getFieldToMatch().equals(this.getFieldToMatch()) == false)
            return false;
        if (other.getTextTransformation() == null ^ this.getTextTransformation() == null)
            return false;
        if (other.getTextTransformation() != null && other.getTextTransformation().equals(this.getTextTransformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldToMatch() == null) ? 0 : getFieldToMatch().hashCode());
        hashCode = prime * hashCode + ((getTextTransformation() == null) ? 0 : getTextTransformation().hashCode());
        return hashCode;
    }

    @Override
    public XssMatchTuple clone() {
        try {
            return (XssMatchTuple) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.XssMatchTupleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
