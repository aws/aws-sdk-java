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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
 * bypass detection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/TextTransformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextTransformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets the relative processing order for multiple transformations that are defined for a rule statement. WAF
     * processes all transformations, from lowest priority to highest, before inspecting the transformed content. The
     * priorities don't need to be consecutive, but they must all be different.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * You can specify the following transformation types:
     * </p>
     * <p>
     * <b>BASE64_DECODE</b> - Decode a <code>Base64</code>-encoded string.
     * </p>
     * <p>
     * <b>BASE64_DECODE_EXT</b> - Decode a <code>Base64</code>-encoded string, but use a forgiving implementation that
     * ignores characters that aren't valid.
     * </p>
     * <p>
     * <b>CMD_LINE</b> - Command-line transformations. These are helpful in reducing effectiveness of attackers who
     * inject an operating system command-line command and use unusual formatting to disguise some or all of the
     * command.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: <code>\ " ' ^</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: <code>/ (</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: <code>, ;</code>
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
     * <b>COMPRESS_WHITE_SPACE</b> - Replace these characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>\f</code>, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\t</code>, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\n</code>, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\r</code>, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\v</code>, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>CSS_DECODE</b> - Decode characters that were encoded using CSS 2.x escape rules
     * <code>syndata.html#characters</code>. This function uses up to two bytes in the decoding process, so it can help
     * to uncover ASCII characters that were encoded using CSS encoding that wouldn’t typically be encoded. It's also
     * useful in countering evasion, which is a combination of a backslash and non-hexadecimal characters. For example,
     * <code>ja\vascript</code> for javascript.
     * </p>
     * <p>
     * <b>ESCAPE_SEQ_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     * <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     * <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code> (octal).
     * Encodings that aren't valid remain in the output.
     * </p>
     * <p>
     * <b>HEX_DECODE</b> - Decode a string of hexadecimal characters into a binary.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b> - Replace HTML-encoded characters with unencoded characters.
     * <code>HTML_ENTITY_DECODE</code> performs these operations:
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
     * <b>JS_DECODE</b> - Decode JavaScript escape sequences. If a <code>\</code> <code>u</code> <code>HHHH</code> code
     * is in the full-width ASCII code range of <code>FF01-FF5E</code>, then the higher byte is used to detect and
     * adjust the lower byte. If not, only the lower byte is used and the higher byte is zeroed, causing a possible loss
     * of information.
     * </p>
     * <p>
     * <b>LOWERCASE</b> - Convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>MD5</b> - Calculate an MD5 hash from the data in the input. The computed hash is in a raw binary form.
     * </p>
     * <p>
     * <b>NONE</b> - Specify <code>NONE</code> if you don't want any text transformations.
     * </p>
     * <p>
     * <b>NORMALIZE_PATH</b> - Remove multiple slashes, directory self-references, and directory back-references that
     * are not at the beginning of the input from an input string.
     * </p>
     * <p>
     * <b>NORMALIZE_PATH_WIN</b> - This is the same as <code>NORMALIZE_PATH</code>, but first converts backslash
     * characters to forward slashes.
     * </p>
     * <p>
     * <b>REMOVE_NULLS</b> - Remove all <code>NULL</code> bytes from the input.
     * </p>
     * <p>
     * <b>REPLACE_COMMENTS</b> - Replace each occurrence of a C-style comment (<code>/* ... *&#47;</code>) with a single
     * space. Multiple consecutive occurrences are not compressed. Unterminated comments are also replaced with a space
     * (ASCII 0x20). However, a standalone termination of a comment (<code>*&#47;</code>) is not acted upon.
     * </p>
     * <p>
     * <b>REPLACE_NULLS</b> - Replace NULL bytes in the input with space characters (ASCII <code>0x20</code>).
     * </p>
     * <p>
     * <b>SQL_HEX_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     * <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     * <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code> (octal).
     * Encodings that aren't valid remain in the output.
     * </p>
     * <p>
     * <b>URL_DECODE</b> - Decode a URL-encoded value.
     * </p>
     * <p>
     * <b>URL_DECODE_UNI</b> - Like <code>URL_DECODE</code>, but with support for Microsoft-specific <code>%u</code>
     * encoding. If the code is in the full-width ASCII code range of <code>FF01-FF5E</code>, the higher byte is used to
     * detect and adjust the lower byte. Otherwise, only the lower byte is used and the higher byte is zeroed.
     * </p>
     * <p>
     * <b>UTF8_TO_UNICODE</b> - Convert all UTF-8 character sequences to Unicode. This helps input normalization, and
     * minimizing false-positives and false-negatives for non-English languages.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Sets the relative processing order for multiple transformations that are defined for a rule statement. WAF
     * processes all transformations, from lowest priority to highest, before inspecting the transformed content. The
     * priorities don't need to be consecutive, but they must all be different.
     * </p>
     * 
     * @param priority
     *        Sets the relative processing order for multiple transformations that are defined for a rule statement. WAF
     *        processes all transformations, from lowest priority to highest, before inspecting the transformed content.
     *        The priorities don't need to be consecutive, but they must all be different.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * Sets the relative processing order for multiple transformations that are defined for a rule statement. WAF
     * processes all transformations, from lowest priority to highest, before inspecting the transformed content. The
     * priorities don't need to be consecutive, but they must all be different.
     * </p>
     * 
     * @return Sets the relative processing order for multiple transformations that are defined for a rule statement.
     *         WAF processes all transformations, from lowest priority to highest, before inspecting the transformed
     *         content. The priorities don't need to be consecutive, but they must all be different.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * Sets the relative processing order for multiple transformations that are defined for a rule statement. WAF
     * processes all transformations, from lowest priority to highest, before inspecting the transformed content. The
     * priorities don't need to be consecutive, but they must all be different.
     * </p>
     * 
     * @param priority
     *        Sets the relative processing order for multiple transformations that are defined for a rule statement. WAF
     *        processes all transformations, from lowest priority to highest, before inspecting the transformed content.
     *        The priorities don't need to be consecutive, but they must all be different.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTransformation withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * You can specify the following transformation types:
     * </p>
     * <p>
     * <b>BASE64_DECODE</b> - Decode a <code>Base64</code>-encoded string.
     * </p>
     * <p>
     * <b>BASE64_DECODE_EXT</b> - Decode a <code>Base64</code>-encoded string, but use a forgiving implementation that
     * ignores characters that aren't valid.
     * </p>
     * <p>
     * <b>CMD_LINE</b> - Command-line transformations. These are helpful in reducing effectiveness of attackers who
     * inject an operating system command-line command and use unusual formatting to disguise some or all of the
     * command.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: <code>\ " ' ^</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: <code>/ (</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: <code>, ;</code>
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
     * <b>COMPRESS_WHITE_SPACE</b> - Replace these characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>\f</code>, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\t</code>, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\n</code>, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\r</code>, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\v</code>, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>CSS_DECODE</b> - Decode characters that were encoded using CSS 2.x escape rules
     * <code>syndata.html#characters</code>. This function uses up to two bytes in the decoding process, so it can help
     * to uncover ASCII characters that were encoded using CSS encoding that wouldn’t typically be encoded. It's also
     * useful in countering evasion, which is a combination of a backslash and non-hexadecimal characters. For example,
     * <code>ja\vascript</code> for javascript.
     * </p>
     * <p>
     * <b>ESCAPE_SEQ_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     * <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     * <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code> (octal).
     * Encodings that aren't valid remain in the output.
     * </p>
     * <p>
     * <b>HEX_DECODE</b> - Decode a string of hexadecimal characters into a binary.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b> - Replace HTML-encoded characters with unencoded characters.
     * <code>HTML_ENTITY_DECODE</code> performs these operations:
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
     * <b>JS_DECODE</b> - Decode JavaScript escape sequences. If a <code>\</code> <code>u</code> <code>HHHH</code> code
     * is in the full-width ASCII code range of <code>FF01-FF5E</code>, then the higher byte is used to detect and
     * adjust the lower byte. If not, only the lower byte is used and the higher byte is zeroed, causing a possible loss
     * of information.
     * </p>
     * <p>
     * <b>LOWERCASE</b> - Convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>MD5</b> - Calculate an MD5 hash from the data in the input. The computed hash is in a raw binary form.
     * </p>
     * <p>
     * <b>NONE</b> - Specify <code>NONE</code> if you don't want any text transformations.
     * </p>
     * <p>
     * <b>NORMALIZE_PATH</b> - Remove multiple slashes, directory self-references, and directory back-references that
     * are not at the beginning of the input from an input string.
     * </p>
     * <p>
     * <b>NORMALIZE_PATH_WIN</b> - This is the same as <code>NORMALIZE_PATH</code>, but first converts backslash
     * characters to forward slashes.
     * </p>
     * <p>
     * <b>REMOVE_NULLS</b> - Remove all <code>NULL</code> bytes from the input.
     * </p>
     * <p>
     * <b>REPLACE_COMMENTS</b> - Replace each occurrence of a C-style comment (<code>/* ... *&#47;</code>) with a single
     * space. Multiple consecutive occurrences are not compressed. Unterminated comments are also replaced with a space
     * (ASCII 0x20). However, a standalone termination of a comment (<code>*&#47;</code>) is not acted upon.
     * </p>
     * <p>
     * <b>REPLACE_NULLS</b> - Replace NULL bytes in the input with space characters (ASCII <code>0x20</code>).
     * </p>
     * <p>
     * <b>SQL_HEX_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     * <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     * <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code> (octal).
     * Encodings that aren't valid remain in the output.
     * </p>
     * <p>
     * <b>URL_DECODE</b> - Decode a URL-encoded value.
     * </p>
     * <p>
     * <b>URL_DECODE_UNI</b> - Like <code>URL_DECODE</code>, but with support for Microsoft-specific <code>%u</code>
     * encoding. If the code is in the full-width ASCII code range of <code>FF01-FF5E</code>, the higher byte is used to
     * detect and adjust the lower byte. Otherwise, only the lower byte is used and the higher byte is zeroed.
     * </p>
     * <p>
     * <b>UTF8_TO_UNICODE</b> - Convert all UTF-8 character sequences to Unicode. This helps input normalization, and
     * minimizing false-positives and false-negatives for non-English languages.
     * </p>
     * 
     * @param type
     *        You can specify the following transformation types:</p>
     *        <p>
     *        <b>BASE64_DECODE</b> - Decode a <code>Base64</code>-encoded string.
     *        </p>
     *        <p>
     *        <b>BASE64_DECODE_EXT</b> - Decode a <code>Base64</code>-encoded string, but use a forgiving implementation
     *        that ignores characters that aren't valid.
     *        </p>
     *        <p>
     *        <b>CMD_LINE</b> - Command-line transformations. These are helpful in reducing effectiveness of attackers
     *        who inject an operating system command-line command and use unusual formatting to disguise some or all of
     *        the command.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Delete the following characters: <code>\ " ' ^</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delete spaces before the following characters: <code>/ (</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace the following characters with a space: <code>, ;</code>
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
     *        <b>COMPRESS_WHITE_SPACE</b> - Replace these characters with a space character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>\f</code>, formfeed, decimal 12
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>\t</code>, tab, decimal 9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>\n</code>, newline, decimal 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>\r</code>, carriage return, decimal 13
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>\v</code>, vertical tab, decimal 11
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     *        </p>
     *        <p>
     *        <b>CSS_DECODE</b> - Decode characters that were encoded using CSS 2.x escape rules
     *        <code>syndata.html#characters</code>. This function uses up to two bytes in the decoding process, so it
     *        can help to uncover ASCII characters that were encoded using CSS encoding that wouldn’t typically be
     *        encoded. It's also useful in countering evasion, which is a combination of a backslash and non-hexadecimal
     *        characters. For example, <code>ja\vascript</code> for javascript.
     *        </p>
     *        <p>
     *        <b>ESCAPE_SEQ_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     *        <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     *        <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code>
     *        (octal). Encodings that aren't valid remain in the output.
     *        </p>
     *        <p>
     *        <b>HEX_DECODE</b> - Decode a string of hexadecimal characters into a binary.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b> - Replace HTML-encoded characters with unencoded characters.
     *        <code>HTML_ENTITY_DECODE</code> performs these operations:
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
     *        <b>JS_DECODE</b> - Decode JavaScript escape sequences. If a <code>\</code> <code>u</code>
     *        <code>HHHH</code> code is in the full-width ASCII code range of <code>FF01-FF5E</code>, then the higher
     *        byte is used to detect and adjust the lower byte. If not, only the lower byte is used and the higher byte
     *        is zeroed, causing a possible loss of information.
     *        </p>
     *        <p>
     *        <b>LOWERCASE</b> - Convert uppercase letters (A-Z) to lowercase (a-z).
     *        </p>
     *        <p>
     *        <b>MD5</b> - Calculate an MD5 hash from the data in the input. The computed hash is in a raw binary form.
     *        </p>
     *        <p>
     *        <b>NONE</b> - Specify <code>NONE</code> if you don't want any text transformations.
     *        </p>
     *        <p>
     *        <b>NORMALIZE_PATH</b> - Remove multiple slashes, directory self-references, and directory back-references
     *        that are not at the beginning of the input from an input string.
     *        </p>
     *        <p>
     *        <b>NORMALIZE_PATH_WIN</b> - This is the same as <code>NORMALIZE_PATH</code>, but first converts backslash
     *        characters to forward slashes.
     *        </p>
     *        <p>
     *        <b>REMOVE_NULLS</b> - Remove all <code>NULL</code> bytes from the input.
     *        </p>
     *        <p>
     *        <b>REPLACE_COMMENTS</b> - Replace each occurrence of a C-style comment (<code>/* ... *&#47;</code>) with a
     *        single space. Multiple consecutive occurrences are not compressed. Unterminated comments are also replaced
     *        with a space (ASCII 0x20). However, a standalone termination of a comment (<code>*&#47;</code>) is not
     *        acted upon.
     *        </p>
     *        <p>
     *        <b>REPLACE_NULLS</b> - Replace NULL bytes in the input with space characters (ASCII <code>0x20</code>).
     *        </p>
     *        <p>
     *        <b>SQL_HEX_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     *        <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     *        <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code>
     *        (octal). Encodings that aren't valid remain in the output.
     *        </p>
     *        <p>
     *        <b>URL_DECODE</b> - Decode a URL-encoded value.
     *        </p>
     *        <p>
     *        <b>URL_DECODE_UNI</b> - Like <code>URL_DECODE</code>, but with support for Microsoft-specific
     *        <code>%u</code> encoding. If the code is in the full-width ASCII code range of <code>FF01-FF5E</code>, the
     *        higher byte is used to detect and adjust the lower byte. Otherwise, only the lower byte is used and the
     *        higher byte is zeroed.
     *        </p>
     *        <p>
     *        <b>UTF8_TO_UNICODE</b> - Convert all UTF-8 character sequences to Unicode. This helps input normalization,
     *        and minimizing false-positives and false-negatives for non-English languages.
     * @see TextTransformationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * You can specify the following transformation types:
     * </p>
     * <p>
     * <b>BASE64_DECODE</b> - Decode a <code>Base64</code>-encoded string.
     * </p>
     * <p>
     * <b>BASE64_DECODE_EXT</b> - Decode a <code>Base64</code>-encoded string, but use a forgiving implementation that
     * ignores characters that aren't valid.
     * </p>
     * <p>
     * <b>CMD_LINE</b> - Command-line transformations. These are helpful in reducing effectiveness of attackers who
     * inject an operating system command-line command and use unusual formatting to disguise some or all of the
     * command.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: <code>\ " ' ^</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: <code>/ (</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: <code>, ;</code>
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
     * <b>COMPRESS_WHITE_SPACE</b> - Replace these characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>\f</code>, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\t</code>, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\n</code>, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\r</code>, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\v</code>, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>CSS_DECODE</b> - Decode characters that were encoded using CSS 2.x escape rules
     * <code>syndata.html#characters</code>. This function uses up to two bytes in the decoding process, so it can help
     * to uncover ASCII characters that were encoded using CSS encoding that wouldn’t typically be encoded. It's also
     * useful in countering evasion, which is a combination of a backslash and non-hexadecimal characters. For example,
     * <code>ja\vascript</code> for javascript.
     * </p>
     * <p>
     * <b>ESCAPE_SEQ_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     * <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     * <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code> (octal).
     * Encodings that aren't valid remain in the output.
     * </p>
     * <p>
     * <b>HEX_DECODE</b> - Decode a string of hexadecimal characters into a binary.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b> - Replace HTML-encoded characters with unencoded characters.
     * <code>HTML_ENTITY_DECODE</code> performs these operations:
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
     * <b>JS_DECODE</b> - Decode JavaScript escape sequences. If a <code>\</code> <code>u</code> <code>HHHH</code> code
     * is in the full-width ASCII code range of <code>FF01-FF5E</code>, then the higher byte is used to detect and
     * adjust the lower byte. If not, only the lower byte is used and the higher byte is zeroed, causing a possible loss
     * of information.
     * </p>
     * <p>
     * <b>LOWERCASE</b> - Convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>MD5</b> - Calculate an MD5 hash from the data in the input. The computed hash is in a raw binary form.
     * </p>
     * <p>
     * <b>NONE</b> - Specify <code>NONE</code> if you don't want any text transformations.
     * </p>
     * <p>
     * <b>NORMALIZE_PATH</b> - Remove multiple slashes, directory self-references, and directory back-references that
     * are not at the beginning of the input from an input string.
     * </p>
     * <p>
     * <b>NORMALIZE_PATH_WIN</b> - This is the same as <code>NORMALIZE_PATH</code>, but first converts backslash
     * characters to forward slashes.
     * </p>
     * <p>
     * <b>REMOVE_NULLS</b> - Remove all <code>NULL</code> bytes from the input.
     * </p>
     * <p>
     * <b>REPLACE_COMMENTS</b> - Replace each occurrence of a C-style comment (<code>/* ... *&#47;</code>) with a single
     * space. Multiple consecutive occurrences are not compressed. Unterminated comments are also replaced with a space
     * (ASCII 0x20). However, a standalone termination of a comment (<code>*&#47;</code>) is not acted upon.
     * </p>
     * <p>
     * <b>REPLACE_NULLS</b> - Replace NULL bytes in the input with space characters (ASCII <code>0x20</code>).
     * </p>
     * <p>
     * <b>SQL_HEX_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     * <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     * <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code> (octal).
     * Encodings that aren't valid remain in the output.
     * </p>
     * <p>
     * <b>URL_DECODE</b> - Decode a URL-encoded value.
     * </p>
     * <p>
     * <b>URL_DECODE_UNI</b> - Like <code>URL_DECODE</code>, but with support for Microsoft-specific <code>%u</code>
     * encoding. If the code is in the full-width ASCII code range of <code>FF01-FF5E</code>, the higher byte is used to
     * detect and adjust the lower byte. Otherwise, only the lower byte is used and the higher byte is zeroed.
     * </p>
     * <p>
     * <b>UTF8_TO_UNICODE</b> - Convert all UTF-8 character sequences to Unicode. This helps input normalization, and
     * minimizing false-positives and false-negatives for non-English languages.
     * </p>
     * 
     * @return You can specify the following transformation types:</p>
     *         <p>
     *         <b>BASE64_DECODE</b> - Decode a <code>Base64</code>-encoded string.
     *         </p>
     *         <p>
     *         <b>BASE64_DECODE_EXT</b> - Decode a <code>Base64</code>-encoded string, but use a forgiving
     *         implementation that ignores characters that aren't valid.
     *         </p>
     *         <p>
     *         <b>CMD_LINE</b> - Command-line transformations. These are helpful in reducing effectiveness of attackers
     *         who inject an operating system command-line command and use unusual formatting to disguise some or all of
     *         the command.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Delete the following characters: <code>\ " ' ^</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delete spaces before the following characters: <code>/ (</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replace the following characters with a space: <code>, ;</code>
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
     *         <b>COMPRESS_WHITE_SPACE</b> - Replace these characters with a space character (decimal 32):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>\f</code>, formfeed, decimal 12
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>\t</code>, tab, decimal 9
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>\n</code>, newline, decimal 10
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>\r</code>, carriage return, decimal 13
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>\v</code>, vertical tab, decimal 11
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Non-breaking space, decimal 160
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     *         </p>
     *         <p>
     *         <b>CSS_DECODE</b> - Decode characters that were encoded using CSS 2.x escape rules
     *         <code>syndata.html#characters</code>. This function uses up to two bytes in the decoding process, so it
     *         can help to uncover ASCII characters that were encoded using CSS encoding that wouldn’t typically be
     *         encoded. It's also useful in countering evasion, which is a combination of a backslash and
     *         non-hexadecimal characters. For example, <code>ja\vascript</code> for javascript.
     *         </p>
     *         <p>
     *         <b>ESCAPE_SEQ_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>, <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     *         <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code>
     *         (octal). Encodings that aren't valid remain in the output.
     *         </p>
     *         <p>
     *         <b>HEX_DECODE</b> - Decode a string of hexadecimal characters into a binary.
     *         </p>
     *         <p>
     *         <b>HTML_ENTITY_DECODE</b> - Replace HTML-encoded characters with unencoded characters.
     *         <code>HTML_ENTITY_DECODE</code> performs these operations:
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
     *         <b>JS_DECODE</b> - Decode JavaScript escape sequences. If a <code>\</code> <code>u</code>
     *         <code>HHHH</code> code is in the full-width ASCII code range of <code>FF01-FF5E</code>, then the higher
     *         byte is used to detect and adjust the lower byte. If not, only the lower byte is used and the higher byte
     *         is zeroed, causing a possible loss of information.
     *         </p>
     *         <p>
     *         <b>LOWERCASE</b> - Convert uppercase letters (A-Z) to lowercase (a-z).
     *         </p>
     *         <p>
     *         <b>MD5</b> - Calculate an MD5 hash from the data in the input. The computed hash is in a raw binary form.
     *         </p>
     *         <p>
     *         <b>NONE</b> - Specify <code>NONE</code> if you don't want any text transformations.
     *         </p>
     *         <p>
     *         <b>NORMALIZE_PATH</b> - Remove multiple slashes, directory self-references, and directory back-references
     *         that are not at the beginning of the input from an input string.
     *         </p>
     *         <p>
     *         <b>NORMALIZE_PATH_WIN</b> - This is the same as <code>NORMALIZE_PATH</code>, but first converts backslash
     *         characters to forward slashes.
     *         </p>
     *         <p>
     *         <b>REMOVE_NULLS</b> - Remove all <code>NULL</code> bytes from the input.
     *         </p>
     *         <p>
     *         <b>REPLACE_COMMENTS</b> - Replace each occurrence of a C-style comment (<code>/* ... *&#47;</code>) with
     *         a single space. Multiple consecutive occurrences are not compressed. Unterminated comments are also
     *         replaced with a space (ASCII 0x20). However, a standalone termination of a comment (<code>*&#47;</code>)
     *         is not acted upon.
     *         </p>
     *         <p>
     *         <b>REPLACE_NULLS</b> - Replace NULL bytes in the input with space characters (ASCII <code>0x20</code>).
     *         </p>
     *         <p>
     *         <b>SQL_HEX_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     *         <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     *         <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code>
     *         (octal). Encodings that aren't valid remain in the output.
     *         </p>
     *         <p>
     *         <b>URL_DECODE</b> - Decode a URL-encoded value.
     *         </p>
     *         <p>
     *         <b>URL_DECODE_UNI</b> - Like <code>URL_DECODE</code>, but with support for Microsoft-specific
     *         <code>%u</code> encoding. If the code is in the full-width ASCII code range of <code>FF01-FF5E</code>,
     *         the higher byte is used to detect and adjust the lower byte. Otherwise, only the lower byte is used and
     *         the higher byte is zeroed.
     *         </p>
     *         <p>
     *         <b>UTF8_TO_UNICODE</b> - Convert all UTF-8 character sequences to Unicode. This helps input
     *         normalization, and minimizing false-positives and false-negatives for non-English languages.
     * @see TextTransformationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * You can specify the following transformation types:
     * </p>
     * <p>
     * <b>BASE64_DECODE</b> - Decode a <code>Base64</code>-encoded string.
     * </p>
     * <p>
     * <b>BASE64_DECODE_EXT</b> - Decode a <code>Base64</code>-encoded string, but use a forgiving implementation that
     * ignores characters that aren't valid.
     * </p>
     * <p>
     * <b>CMD_LINE</b> - Command-line transformations. These are helpful in reducing effectiveness of attackers who
     * inject an operating system command-line command and use unusual formatting to disguise some or all of the
     * command.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: <code>\ " ' ^</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: <code>/ (</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: <code>, ;</code>
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
     * <b>COMPRESS_WHITE_SPACE</b> - Replace these characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>\f</code>, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\t</code>, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\n</code>, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\r</code>, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\v</code>, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>CSS_DECODE</b> - Decode characters that were encoded using CSS 2.x escape rules
     * <code>syndata.html#characters</code>. This function uses up to two bytes in the decoding process, so it can help
     * to uncover ASCII characters that were encoded using CSS encoding that wouldn’t typically be encoded. It's also
     * useful in countering evasion, which is a combination of a backslash and non-hexadecimal characters. For example,
     * <code>ja\vascript</code> for javascript.
     * </p>
     * <p>
     * <b>ESCAPE_SEQ_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     * <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     * <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code> (octal).
     * Encodings that aren't valid remain in the output.
     * </p>
     * <p>
     * <b>HEX_DECODE</b> - Decode a string of hexadecimal characters into a binary.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b> - Replace HTML-encoded characters with unencoded characters.
     * <code>HTML_ENTITY_DECODE</code> performs these operations:
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
     * <b>JS_DECODE</b> - Decode JavaScript escape sequences. If a <code>\</code> <code>u</code> <code>HHHH</code> code
     * is in the full-width ASCII code range of <code>FF01-FF5E</code>, then the higher byte is used to detect and
     * adjust the lower byte. If not, only the lower byte is used and the higher byte is zeroed, causing a possible loss
     * of information.
     * </p>
     * <p>
     * <b>LOWERCASE</b> - Convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>MD5</b> - Calculate an MD5 hash from the data in the input. The computed hash is in a raw binary form.
     * </p>
     * <p>
     * <b>NONE</b> - Specify <code>NONE</code> if you don't want any text transformations.
     * </p>
     * <p>
     * <b>NORMALIZE_PATH</b> - Remove multiple slashes, directory self-references, and directory back-references that
     * are not at the beginning of the input from an input string.
     * </p>
     * <p>
     * <b>NORMALIZE_PATH_WIN</b> - This is the same as <code>NORMALIZE_PATH</code>, but first converts backslash
     * characters to forward slashes.
     * </p>
     * <p>
     * <b>REMOVE_NULLS</b> - Remove all <code>NULL</code> bytes from the input.
     * </p>
     * <p>
     * <b>REPLACE_COMMENTS</b> - Replace each occurrence of a C-style comment (<code>/* ... *&#47;</code>) with a single
     * space. Multiple consecutive occurrences are not compressed. Unterminated comments are also replaced with a space
     * (ASCII 0x20). However, a standalone termination of a comment (<code>*&#47;</code>) is not acted upon.
     * </p>
     * <p>
     * <b>REPLACE_NULLS</b> - Replace NULL bytes in the input with space characters (ASCII <code>0x20</code>).
     * </p>
     * <p>
     * <b>SQL_HEX_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     * <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     * <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code> (octal).
     * Encodings that aren't valid remain in the output.
     * </p>
     * <p>
     * <b>URL_DECODE</b> - Decode a URL-encoded value.
     * </p>
     * <p>
     * <b>URL_DECODE_UNI</b> - Like <code>URL_DECODE</code>, but with support for Microsoft-specific <code>%u</code>
     * encoding. If the code is in the full-width ASCII code range of <code>FF01-FF5E</code>, the higher byte is used to
     * detect and adjust the lower byte. Otherwise, only the lower byte is used and the higher byte is zeroed.
     * </p>
     * <p>
     * <b>UTF8_TO_UNICODE</b> - Convert all UTF-8 character sequences to Unicode. This helps input normalization, and
     * minimizing false-positives and false-negatives for non-English languages.
     * </p>
     * 
     * @param type
     *        You can specify the following transformation types:</p>
     *        <p>
     *        <b>BASE64_DECODE</b> - Decode a <code>Base64</code>-encoded string.
     *        </p>
     *        <p>
     *        <b>BASE64_DECODE_EXT</b> - Decode a <code>Base64</code>-encoded string, but use a forgiving implementation
     *        that ignores characters that aren't valid.
     *        </p>
     *        <p>
     *        <b>CMD_LINE</b> - Command-line transformations. These are helpful in reducing effectiveness of attackers
     *        who inject an operating system command-line command and use unusual formatting to disguise some or all of
     *        the command.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Delete the following characters: <code>\ " ' ^</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delete spaces before the following characters: <code>/ (</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace the following characters with a space: <code>, ;</code>
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
     *        <b>COMPRESS_WHITE_SPACE</b> - Replace these characters with a space character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>\f</code>, formfeed, decimal 12
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>\t</code>, tab, decimal 9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>\n</code>, newline, decimal 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>\r</code>, carriage return, decimal 13
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>\v</code>, vertical tab, decimal 11
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     *        </p>
     *        <p>
     *        <b>CSS_DECODE</b> - Decode characters that were encoded using CSS 2.x escape rules
     *        <code>syndata.html#characters</code>. This function uses up to two bytes in the decoding process, so it
     *        can help to uncover ASCII characters that were encoded using CSS encoding that wouldn’t typically be
     *        encoded. It's also useful in countering evasion, which is a combination of a backslash and non-hexadecimal
     *        characters. For example, <code>ja\vascript</code> for javascript.
     *        </p>
     *        <p>
     *        <b>ESCAPE_SEQ_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     *        <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     *        <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code>
     *        (octal). Encodings that aren't valid remain in the output.
     *        </p>
     *        <p>
     *        <b>HEX_DECODE</b> - Decode a string of hexadecimal characters into a binary.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b> - Replace HTML-encoded characters with unencoded characters.
     *        <code>HTML_ENTITY_DECODE</code> performs these operations:
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
     *        <b>JS_DECODE</b> - Decode JavaScript escape sequences. If a <code>\</code> <code>u</code>
     *        <code>HHHH</code> code is in the full-width ASCII code range of <code>FF01-FF5E</code>, then the higher
     *        byte is used to detect and adjust the lower byte. If not, only the lower byte is used and the higher byte
     *        is zeroed, causing a possible loss of information.
     *        </p>
     *        <p>
     *        <b>LOWERCASE</b> - Convert uppercase letters (A-Z) to lowercase (a-z).
     *        </p>
     *        <p>
     *        <b>MD5</b> - Calculate an MD5 hash from the data in the input. The computed hash is in a raw binary form.
     *        </p>
     *        <p>
     *        <b>NONE</b> - Specify <code>NONE</code> if you don't want any text transformations.
     *        </p>
     *        <p>
     *        <b>NORMALIZE_PATH</b> - Remove multiple slashes, directory self-references, and directory back-references
     *        that are not at the beginning of the input from an input string.
     *        </p>
     *        <p>
     *        <b>NORMALIZE_PATH_WIN</b> - This is the same as <code>NORMALIZE_PATH</code>, but first converts backslash
     *        characters to forward slashes.
     *        </p>
     *        <p>
     *        <b>REMOVE_NULLS</b> - Remove all <code>NULL</code> bytes from the input.
     *        </p>
     *        <p>
     *        <b>REPLACE_COMMENTS</b> - Replace each occurrence of a C-style comment (<code>/* ... *&#47;</code>) with a
     *        single space. Multiple consecutive occurrences are not compressed. Unterminated comments are also replaced
     *        with a space (ASCII 0x20). However, a standalone termination of a comment (<code>*&#47;</code>) is not
     *        acted upon.
     *        </p>
     *        <p>
     *        <b>REPLACE_NULLS</b> - Replace NULL bytes in the input with space characters (ASCII <code>0x20</code>).
     *        </p>
     *        <p>
     *        <b>SQL_HEX_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     *        <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     *        <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code>
     *        (octal). Encodings that aren't valid remain in the output.
     *        </p>
     *        <p>
     *        <b>URL_DECODE</b> - Decode a URL-encoded value.
     *        </p>
     *        <p>
     *        <b>URL_DECODE_UNI</b> - Like <code>URL_DECODE</code>, but with support for Microsoft-specific
     *        <code>%u</code> encoding. If the code is in the full-width ASCII code range of <code>FF01-FF5E</code>, the
     *        higher byte is used to detect and adjust the lower byte. Otherwise, only the lower byte is used and the
     *        higher byte is zeroed.
     *        </p>
     *        <p>
     *        <b>UTF8_TO_UNICODE</b> - Convert all UTF-8 character sequences to Unicode. This helps input normalization,
     *        and minimizing false-positives and false-negatives for non-English languages.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextTransformationType
     */

    public TextTransformation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * You can specify the following transformation types:
     * </p>
     * <p>
     * <b>BASE64_DECODE</b> - Decode a <code>Base64</code>-encoded string.
     * </p>
     * <p>
     * <b>BASE64_DECODE_EXT</b> - Decode a <code>Base64</code>-encoded string, but use a forgiving implementation that
     * ignores characters that aren't valid.
     * </p>
     * <p>
     * <b>CMD_LINE</b> - Command-line transformations. These are helpful in reducing effectiveness of attackers who
     * inject an operating system command-line command and use unusual formatting to disguise some or all of the
     * command.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: <code>\ " ' ^</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: <code>/ (</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: <code>, ;</code>
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
     * <b>COMPRESS_WHITE_SPACE</b> - Replace these characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>\f</code>, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\t</code>, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\n</code>, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\r</code>, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>\v</code>, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>CSS_DECODE</b> - Decode characters that were encoded using CSS 2.x escape rules
     * <code>syndata.html#characters</code>. This function uses up to two bytes in the decoding process, so it can help
     * to uncover ASCII characters that were encoded using CSS encoding that wouldn’t typically be encoded. It's also
     * useful in countering evasion, which is a combination of a backslash and non-hexadecimal characters. For example,
     * <code>ja\vascript</code> for javascript.
     * </p>
     * <p>
     * <b>ESCAPE_SEQ_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     * <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     * <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code> (octal).
     * Encodings that aren't valid remain in the output.
     * </p>
     * <p>
     * <b>HEX_DECODE</b> - Decode a string of hexadecimal characters into a binary.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b> - Replace HTML-encoded characters with unencoded characters.
     * <code>HTML_ENTITY_DECODE</code> performs these operations:
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
     * <b>JS_DECODE</b> - Decode JavaScript escape sequences. If a <code>\</code> <code>u</code> <code>HHHH</code> code
     * is in the full-width ASCII code range of <code>FF01-FF5E</code>, then the higher byte is used to detect and
     * adjust the lower byte. If not, only the lower byte is used and the higher byte is zeroed, causing a possible loss
     * of information.
     * </p>
     * <p>
     * <b>LOWERCASE</b> - Convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>MD5</b> - Calculate an MD5 hash from the data in the input. The computed hash is in a raw binary form.
     * </p>
     * <p>
     * <b>NONE</b> - Specify <code>NONE</code> if you don't want any text transformations.
     * </p>
     * <p>
     * <b>NORMALIZE_PATH</b> - Remove multiple slashes, directory self-references, and directory back-references that
     * are not at the beginning of the input from an input string.
     * </p>
     * <p>
     * <b>NORMALIZE_PATH_WIN</b> - This is the same as <code>NORMALIZE_PATH</code>, but first converts backslash
     * characters to forward slashes.
     * </p>
     * <p>
     * <b>REMOVE_NULLS</b> - Remove all <code>NULL</code> bytes from the input.
     * </p>
     * <p>
     * <b>REPLACE_COMMENTS</b> - Replace each occurrence of a C-style comment (<code>/* ... *&#47;</code>) with a single
     * space. Multiple consecutive occurrences are not compressed. Unterminated comments are also replaced with a space
     * (ASCII 0x20). However, a standalone termination of a comment (<code>*&#47;</code>) is not acted upon.
     * </p>
     * <p>
     * <b>REPLACE_NULLS</b> - Replace NULL bytes in the input with space characters (ASCII <code>0x20</code>).
     * </p>
     * <p>
     * <b>SQL_HEX_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     * <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     * <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code> (octal).
     * Encodings that aren't valid remain in the output.
     * </p>
     * <p>
     * <b>URL_DECODE</b> - Decode a URL-encoded value.
     * </p>
     * <p>
     * <b>URL_DECODE_UNI</b> - Like <code>URL_DECODE</code>, but with support for Microsoft-specific <code>%u</code>
     * encoding. If the code is in the full-width ASCII code range of <code>FF01-FF5E</code>, the higher byte is used to
     * detect and adjust the lower byte. Otherwise, only the lower byte is used and the higher byte is zeroed.
     * </p>
     * <p>
     * <b>UTF8_TO_UNICODE</b> - Convert all UTF-8 character sequences to Unicode. This helps input normalization, and
     * minimizing false-positives and false-negatives for non-English languages.
     * </p>
     * 
     * @param type
     *        You can specify the following transformation types:</p>
     *        <p>
     *        <b>BASE64_DECODE</b> - Decode a <code>Base64</code>-encoded string.
     *        </p>
     *        <p>
     *        <b>BASE64_DECODE_EXT</b> - Decode a <code>Base64</code>-encoded string, but use a forgiving implementation
     *        that ignores characters that aren't valid.
     *        </p>
     *        <p>
     *        <b>CMD_LINE</b> - Command-line transformations. These are helpful in reducing effectiveness of attackers
     *        who inject an operating system command-line command and use unusual formatting to disguise some or all of
     *        the command.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Delete the following characters: <code>\ " ' ^</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delete spaces before the following characters: <code>/ (</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace the following characters with a space: <code>, ;</code>
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
     *        <b>COMPRESS_WHITE_SPACE</b> - Replace these characters with a space character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>\f</code>, formfeed, decimal 12
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>\t</code>, tab, decimal 9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>\n</code>, newline, decimal 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>\r</code>, carriage return, decimal 13
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>\v</code>, vertical tab, decimal 11
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     *        </p>
     *        <p>
     *        <b>CSS_DECODE</b> - Decode characters that were encoded using CSS 2.x escape rules
     *        <code>syndata.html#characters</code>. This function uses up to two bytes in the decoding process, so it
     *        can help to uncover ASCII characters that were encoded using CSS encoding that wouldn’t typically be
     *        encoded. It's also useful in countering evasion, which is a combination of a backslash and non-hexadecimal
     *        characters. For example, <code>ja\vascript</code> for javascript.
     *        </p>
     *        <p>
     *        <b>ESCAPE_SEQ_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     *        <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     *        <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code>
     *        (octal). Encodings that aren't valid remain in the output.
     *        </p>
     *        <p>
     *        <b>HEX_DECODE</b> - Decode a string of hexadecimal characters into a binary.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b> - Replace HTML-encoded characters with unencoded characters.
     *        <code>HTML_ENTITY_DECODE</code> performs these operations:
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
     *        <b>JS_DECODE</b> - Decode JavaScript escape sequences. If a <code>\</code> <code>u</code>
     *        <code>HHHH</code> code is in the full-width ASCII code range of <code>FF01-FF5E</code>, then the higher
     *        byte is used to detect and adjust the lower byte. If not, only the lower byte is used and the higher byte
     *        is zeroed, causing a possible loss of information.
     *        </p>
     *        <p>
     *        <b>LOWERCASE</b> - Convert uppercase letters (A-Z) to lowercase (a-z).
     *        </p>
     *        <p>
     *        <b>MD5</b> - Calculate an MD5 hash from the data in the input. The computed hash is in a raw binary form.
     *        </p>
     *        <p>
     *        <b>NONE</b> - Specify <code>NONE</code> if you don't want any text transformations.
     *        </p>
     *        <p>
     *        <b>NORMALIZE_PATH</b> - Remove multiple slashes, directory self-references, and directory back-references
     *        that are not at the beginning of the input from an input string.
     *        </p>
     *        <p>
     *        <b>NORMALIZE_PATH_WIN</b> - This is the same as <code>NORMALIZE_PATH</code>, but first converts backslash
     *        characters to forward slashes.
     *        </p>
     *        <p>
     *        <b>REMOVE_NULLS</b> - Remove all <code>NULL</code> bytes from the input.
     *        </p>
     *        <p>
     *        <b>REPLACE_COMMENTS</b> - Replace each occurrence of a C-style comment (<code>/* ... *&#47;</code>) with a
     *        single space. Multiple consecutive occurrences are not compressed. Unterminated comments are also replaced
     *        with a space (ASCII 0x20). However, a standalone termination of a comment (<code>*&#47;</code>) is not
     *        acted upon.
     *        </p>
     *        <p>
     *        <b>REPLACE_NULLS</b> - Replace NULL bytes in the input with space characters (ASCII <code>0x20</code>).
     *        </p>
     *        <p>
     *        <b>SQL_HEX_DECODE</b> - Decode the following ANSI C escape sequences: <code>\a</code>, <code>\b</code>,
     *        <code>\f</code>, <code>\n</code>, <code>\r</code>, <code>\t</code>, <code>\v</code>, <code>\\</code>,
     *        <code>\?</code>, <code>\'</code>, <code>\"</code>, <code>\xHH</code> (hexadecimal), <code>\0OOO</code>
     *        (octal). Encodings that aren't valid remain in the output.
     *        </p>
     *        <p>
     *        <b>URL_DECODE</b> - Decode a URL-encoded value.
     *        </p>
     *        <p>
     *        <b>URL_DECODE_UNI</b> - Like <code>URL_DECODE</code>, but with support for Microsoft-specific
     *        <code>%u</code> encoding. If the code is in the full-width ASCII code range of <code>FF01-FF5E</code>, the
     *        higher byte is used to detect and adjust the lower byte. Otherwise, only the lower byte is used and the
     *        higher byte is zeroed.
     *        </p>
     *        <p>
     *        <b>UTF8_TO_UNICODE</b> - Convert all UTF-8 character sequences to Unicode. This helps input normalization,
     *        and minimizing false-positives and false-negatives for non-English languages.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextTransformationType
     */

    public TextTransformation withType(TextTransformationType type) {
        this.type = type.toString();
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
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextTransformation == false)
            return false;
        TextTransformation other = (TextTransformation) obj;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public TextTransformation clone() {
        try {
            return (TextTransformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.TextTransformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
