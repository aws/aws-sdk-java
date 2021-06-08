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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a single cell in a table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/Cell" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cell implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The formula contained in the cell. This field is empty if a cell does not have a formula.
     * </p>
     */
    private String formula;
    /**
     * <p>
     * The format of the cell. If this field is empty, then the format is either not specified in the workbook or the
     * format is set to AUTO.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The raw value of the data contained in the cell. The raw value depends on the format of the data in the cell.
     * However the attribute in the API return value is always a string containing the raw value.
     * </p>
     * <p>
     * Cells with format DATE, DATE_TIME or TIME have the raw value as a floating point number where the whole number
     * represents the number of days since 1/1/1900 and the fractional part represents the fraction of the day since
     * midnight. For example, a cell with date 11/3/2020 has the raw value "44138". A cell with the time 9:00 AM has the
     * raw value "0.375" and a cell with date/time value of 11/3/2020 9:00 AM has the raw value "44138.375". Notice that
     * even though the raw value is a number in all three cases, it is still represented as a string.
     * </p>
     * <p>
     * Cells with format NUMBER, CURRENCY, PERCENTAGE and ACCOUNTING have the raw value of the data as the number
     * representing the data being displayed. For example, the number 1.325 with two decimal places in the format will
     * have it's raw value as "1.325" and formatted value as "1.33". A currency value for $10 will have the raw value as
     * "10" and formatted value as "$10.00". A value representing 20% with two decimal places in the format will have
     * its raw value as "0.2" and the formatted value as "20.00%". An accounting value of -$25 will have "-25" as the
     * raw value and "$ (25.00)" as the formatted value.
     * </p>
     * <p>
     * Cells with format TEXT will have the raw text as the raw value. For example, a cell with text "John Smith" will
     * have "John Smith" as both the raw value and the formatted value.
     * </p>
     * <p>
     * Cells with format CONTACT will have the name of the contact as a formatted value and the email address of the
     * contact as the raw value. For example, a contact for John Smith will have "John Smith" as the formatted value and
     * "john.smith@example.com" as the raw value.
     * </p>
     * <p>
     * Cells with format ROWLINK (aka picklist) will have the first column of the linked row as the formatted value and
     * the row id of the linked row as the raw value. For example, a cell containing a picklist to a table that displays
     * task status might have "Completed" as the formatted value and
     * "row:dfcefaee-5b37-4355-8f28-40c3e4ff5dd4/ca432b2f-b8eb-431d-9fb5-cbe0342f9f03" as the raw value.
     * </p>
     * <p>
     * Cells with format AUTO or cells without any format that are auto-detected as one of the formats above will
     * contain the raw and formatted values as mentioned above, based on the auto-detected formats. If there is no
     * auto-detected format, the raw and formatted values will be the same as the data in the cell.
     * </p>
     */
    private String rawValue;
    /**
     * <p>
     * The formatted value of the cell. This is the value that you see displayed in the cell in the UI.
     * </p>
     * <p>
     * Note that the formatted value of a cell is always represented as a string irrespective of the data that is stored
     * in the cell. For example, if a cell contains a date, the formatted value of the cell is the string representation
     * of the formatted date being shown in the cell in the UI. See details in the rawValue field below for how cells of
     * different formats will have different raw and formatted values.
     * </p>
     */
    private String formattedValue;

    /**
     * <p>
     * The formula contained in the cell. This field is empty if a cell does not have a formula.
     * </p>
     * 
     * @param formula
     *        The formula contained in the cell. This field is empty if a cell does not have a formula.
     */

    public void setFormula(String formula) {
        this.formula = formula;
    }

    /**
     * <p>
     * The formula contained in the cell. This field is empty if a cell does not have a formula.
     * </p>
     * 
     * @return The formula contained in the cell. This field is empty if a cell does not have a formula.
     */

    public String getFormula() {
        return this.formula;
    }

    /**
     * <p>
     * The formula contained in the cell. This field is empty if a cell does not have a formula.
     * </p>
     * 
     * @param formula
     *        The formula contained in the cell. This field is empty if a cell does not have a formula.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cell withFormula(String formula) {
        setFormula(formula);
        return this;
    }

    /**
     * <p>
     * The format of the cell. If this field is empty, then the format is either not specified in the workbook or the
     * format is set to AUTO.
     * </p>
     * 
     * @param format
     *        The format of the cell. If this field is empty, then the format is either not specified in the workbook or
     *        the format is set to AUTO.
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the cell. If this field is empty, then the format is either not specified in the workbook or the
     * format is set to AUTO.
     * </p>
     * 
     * @return The format of the cell. If this field is empty, then the format is either not specified in the workbook
     *         or the format is set to AUTO.
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the cell. If this field is empty, then the format is either not specified in the workbook or the
     * format is set to AUTO.
     * </p>
     * 
     * @param format
     *        The format of the cell. If this field is empty, then the format is either not specified in the workbook or
     *        the format is set to AUTO.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public Cell withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the cell. If this field is empty, then the format is either not specified in the workbook or the
     * format is set to AUTO.
     * </p>
     * 
     * @param format
     *        The format of the cell. If this field is empty, then the format is either not specified in the workbook or
     *        the format is set to AUTO.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public Cell withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The raw value of the data contained in the cell. The raw value depends on the format of the data in the cell.
     * However the attribute in the API return value is always a string containing the raw value.
     * </p>
     * <p>
     * Cells with format DATE, DATE_TIME or TIME have the raw value as a floating point number where the whole number
     * represents the number of days since 1/1/1900 and the fractional part represents the fraction of the day since
     * midnight. For example, a cell with date 11/3/2020 has the raw value "44138". A cell with the time 9:00 AM has the
     * raw value "0.375" and a cell with date/time value of 11/3/2020 9:00 AM has the raw value "44138.375". Notice that
     * even though the raw value is a number in all three cases, it is still represented as a string.
     * </p>
     * <p>
     * Cells with format NUMBER, CURRENCY, PERCENTAGE and ACCOUNTING have the raw value of the data as the number
     * representing the data being displayed. For example, the number 1.325 with two decimal places in the format will
     * have it's raw value as "1.325" and formatted value as "1.33". A currency value for $10 will have the raw value as
     * "10" and formatted value as "$10.00". A value representing 20% with two decimal places in the format will have
     * its raw value as "0.2" and the formatted value as "20.00%". An accounting value of -$25 will have "-25" as the
     * raw value and "$ (25.00)" as the formatted value.
     * </p>
     * <p>
     * Cells with format TEXT will have the raw text as the raw value. For example, a cell with text "John Smith" will
     * have "John Smith" as both the raw value and the formatted value.
     * </p>
     * <p>
     * Cells with format CONTACT will have the name of the contact as a formatted value and the email address of the
     * contact as the raw value. For example, a contact for John Smith will have "John Smith" as the formatted value and
     * "john.smith@example.com" as the raw value.
     * </p>
     * <p>
     * Cells with format ROWLINK (aka picklist) will have the first column of the linked row as the formatted value and
     * the row id of the linked row as the raw value. For example, a cell containing a picklist to a table that displays
     * task status might have "Completed" as the formatted value and
     * "row:dfcefaee-5b37-4355-8f28-40c3e4ff5dd4/ca432b2f-b8eb-431d-9fb5-cbe0342f9f03" as the raw value.
     * </p>
     * <p>
     * Cells with format AUTO or cells without any format that are auto-detected as one of the formats above will
     * contain the raw and formatted values as mentioned above, based on the auto-detected formats. If there is no
     * auto-detected format, the raw and formatted values will be the same as the data in the cell.
     * </p>
     * 
     * @param rawValue
     *        The raw value of the data contained in the cell. The raw value depends on the format of the data in the
     *        cell. However the attribute in the API return value is always a string containing the raw value. </p>
     *        <p>
     *        Cells with format DATE, DATE_TIME or TIME have the raw value as a floating point number where the whole
     *        number represents the number of days since 1/1/1900 and the fractional part represents the fraction of the
     *        day since midnight. For example, a cell with date 11/3/2020 has the raw value "44138". A cell with the
     *        time 9:00 AM has the raw value "0.375" and a cell with date/time value of 11/3/2020 9:00 AM has the raw
     *        value "44138.375". Notice that even though the raw value is a number in all three cases, it is still
     *        represented as a string.
     *        </p>
     *        <p>
     *        Cells with format NUMBER, CURRENCY, PERCENTAGE and ACCOUNTING have the raw value of the data as the number
     *        representing the data being displayed. For example, the number 1.325 with two decimal places in the format
     *        will have it's raw value as "1.325" and formatted value as "1.33". A currency value for $10 will have the
     *        raw value as "10" and formatted value as "$10.00". A value representing 20% with two decimal places in the
     *        format will have its raw value as "0.2" and the formatted value as "20.00%". An accounting value of -$25
     *        will have "-25" as the raw value and "$ (25.00)" as the formatted value.
     *        </p>
     *        <p>
     *        Cells with format TEXT will have the raw text as the raw value. For example, a cell with text "John Smith"
     *        will have "John Smith" as both the raw value and the formatted value.
     *        </p>
     *        <p>
     *        Cells with format CONTACT will have the name of the contact as a formatted value and the email address of
     *        the contact as the raw value. For example, a contact for John Smith will have "John Smith" as the
     *        formatted value and "john.smith@example.com" as the raw value.
     *        </p>
     *        <p>
     *        Cells with format ROWLINK (aka picklist) will have the first column of the linked row as the formatted
     *        value and the row id of the linked row as the raw value. For example, a cell containing a picklist to a
     *        table that displays task status might have "Completed" as the formatted value and
     *        "row:dfcefaee-5b37-4355-8f28-40c3e4ff5dd4/ca432b2f-b8eb-431d-9fb5-cbe0342f9f03" as the raw value.
     *        </p>
     *        <p>
     *        Cells with format AUTO or cells without any format that are auto-detected as one of the formats above will
     *        contain the raw and formatted values as mentioned above, based on the auto-detected formats. If there is
     *        no auto-detected format, the raw and formatted values will be the same as the data in the cell.
     */

    public void setRawValue(String rawValue) {
        this.rawValue = rawValue;
    }

    /**
     * <p>
     * The raw value of the data contained in the cell. The raw value depends on the format of the data in the cell.
     * However the attribute in the API return value is always a string containing the raw value.
     * </p>
     * <p>
     * Cells with format DATE, DATE_TIME or TIME have the raw value as a floating point number where the whole number
     * represents the number of days since 1/1/1900 and the fractional part represents the fraction of the day since
     * midnight. For example, a cell with date 11/3/2020 has the raw value "44138". A cell with the time 9:00 AM has the
     * raw value "0.375" and a cell with date/time value of 11/3/2020 9:00 AM has the raw value "44138.375". Notice that
     * even though the raw value is a number in all three cases, it is still represented as a string.
     * </p>
     * <p>
     * Cells with format NUMBER, CURRENCY, PERCENTAGE and ACCOUNTING have the raw value of the data as the number
     * representing the data being displayed. For example, the number 1.325 with two decimal places in the format will
     * have it's raw value as "1.325" and formatted value as "1.33". A currency value for $10 will have the raw value as
     * "10" and formatted value as "$10.00". A value representing 20% with two decimal places in the format will have
     * its raw value as "0.2" and the formatted value as "20.00%". An accounting value of -$25 will have "-25" as the
     * raw value and "$ (25.00)" as the formatted value.
     * </p>
     * <p>
     * Cells with format TEXT will have the raw text as the raw value. For example, a cell with text "John Smith" will
     * have "John Smith" as both the raw value and the formatted value.
     * </p>
     * <p>
     * Cells with format CONTACT will have the name of the contact as a formatted value and the email address of the
     * contact as the raw value. For example, a contact for John Smith will have "John Smith" as the formatted value and
     * "john.smith@example.com" as the raw value.
     * </p>
     * <p>
     * Cells with format ROWLINK (aka picklist) will have the first column of the linked row as the formatted value and
     * the row id of the linked row as the raw value. For example, a cell containing a picklist to a table that displays
     * task status might have "Completed" as the formatted value and
     * "row:dfcefaee-5b37-4355-8f28-40c3e4ff5dd4/ca432b2f-b8eb-431d-9fb5-cbe0342f9f03" as the raw value.
     * </p>
     * <p>
     * Cells with format AUTO or cells without any format that are auto-detected as one of the formats above will
     * contain the raw and formatted values as mentioned above, based on the auto-detected formats. If there is no
     * auto-detected format, the raw and formatted values will be the same as the data in the cell.
     * </p>
     * 
     * @return The raw value of the data contained in the cell. The raw value depends on the format of the data in the
     *         cell. However the attribute in the API return value is always a string containing the raw value. </p>
     *         <p>
     *         Cells with format DATE, DATE_TIME or TIME have the raw value as a floating point number where the whole
     *         number represents the number of days since 1/1/1900 and the fractional part represents the fraction of
     *         the day since midnight. For example, a cell with date 11/3/2020 has the raw value "44138". A cell with
     *         the time 9:00 AM has the raw value "0.375" and a cell with date/time value of 11/3/2020 9:00 AM has the
     *         raw value "44138.375". Notice that even though the raw value is a number in all three cases, it is still
     *         represented as a string.
     *         </p>
     *         <p>
     *         Cells with format NUMBER, CURRENCY, PERCENTAGE and ACCOUNTING have the raw value of the data as the
     *         number representing the data being displayed. For example, the number 1.325 with two decimal places in
     *         the format will have it's raw value as "1.325" and formatted value as "1.33". A currency value for $10
     *         will have the raw value as "10" and formatted value as "$10.00". A value representing 20% with two
     *         decimal places in the format will have its raw value as "0.2" and the formatted value as "20.00%". An
     *         accounting value of -$25 will have "-25" as the raw value and "$ (25.00)" as the formatted value.
     *         </p>
     *         <p>
     *         Cells with format TEXT will have the raw text as the raw value. For example, a cell with text
     *         "John Smith" will have "John Smith" as both the raw value and the formatted value.
     *         </p>
     *         <p>
     *         Cells with format CONTACT will have the name of the contact as a formatted value and the email address of
     *         the contact as the raw value. For example, a contact for John Smith will have "John Smith" as the
     *         formatted value and "john.smith@example.com" as the raw value.
     *         </p>
     *         <p>
     *         Cells with format ROWLINK (aka picklist) will have the first column of the linked row as the formatted
     *         value and the row id of the linked row as the raw value. For example, a cell containing a picklist to a
     *         table that displays task status might have "Completed" as the formatted value and
     *         "row:dfcefaee-5b37-4355-8f28-40c3e4ff5dd4/ca432b2f-b8eb-431d-9fb5-cbe0342f9f03" as the raw value.
     *         </p>
     *         <p>
     *         Cells with format AUTO or cells without any format that are auto-detected as one of the formats above
     *         will contain the raw and formatted values as mentioned above, based on the auto-detected formats. If
     *         there is no auto-detected format, the raw and formatted values will be the same as the data in the cell.
     */

    public String getRawValue() {
        return this.rawValue;
    }

    /**
     * <p>
     * The raw value of the data contained in the cell. The raw value depends on the format of the data in the cell.
     * However the attribute in the API return value is always a string containing the raw value.
     * </p>
     * <p>
     * Cells with format DATE, DATE_TIME or TIME have the raw value as a floating point number where the whole number
     * represents the number of days since 1/1/1900 and the fractional part represents the fraction of the day since
     * midnight. For example, a cell with date 11/3/2020 has the raw value "44138". A cell with the time 9:00 AM has the
     * raw value "0.375" and a cell with date/time value of 11/3/2020 9:00 AM has the raw value "44138.375". Notice that
     * even though the raw value is a number in all three cases, it is still represented as a string.
     * </p>
     * <p>
     * Cells with format NUMBER, CURRENCY, PERCENTAGE and ACCOUNTING have the raw value of the data as the number
     * representing the data being displayed. For example, the number 1.325 with two decimal places in the format will
     * have it's raw value as "1.325" and formatted value as "1.33". A currency value for $10 will have the raw value as
     * "10" and formatted value as "$10.00". A value representing 20% with two decimal places in the format will have
     * its raw value as "0.2" and the formatted value as "20.00%". An accounting value of -$25 will have "-25" as the
     * raw value and "$ (25.00)" as the formatted value.
     * </p>
     * <p>
     * Cells with format TEXT will have the raw text as the raw value. For example, a cell with text "John Smith" will
     * have "John Smith" as both the raw value and the formatted value.
     * </p>
     * <p>
     * Cells with format CONTACT will have the name of the contact as a formatted value and the email address of the
     * contact as the raw value. For example, a contact for John Smith will have "John Smith" as the formatted value and
     * "john.smith@example.com" as the raw value.
     * </p>
     * <p>
     * Cells with format ROWLINK (aka picklist) will have the first column of the linked row as the formatted value and
     * the row id of the linked row as the raw value. For example, a cell containing a picklist to a table that displays
     * task status might have "Completed" as the formatted value and
     * "row:dfcefaee-5b37-4355-8f28-40c3e4ff5dd4/ca432b2f-b8eb-431d-9fb5-cbe0342f9f03" as the raw value.
     * </p>
     * <p>
     * Cells with format AUTO or cells without any format that are auto-detected as one of the formats above will
     * contain the raw and formatted values as mentioned above, based on the auto-detected formats. If there is no
     * auto-detected format, the raw and formatted values will be the same as the data in the cell.
     * </p>
     * 
     * @param rawValue
     *        The raw value of the data contained in the cell. The raw value depends on the format of the data in the
     *        cell. However the attribute in the API return value is always a string containing the raw value. </p>
     *        <p>
     *        Cells with format DATE, DATE_TIME or TIME have the raw value as a floating point number where the whole
     *        number represents the number of days since 1/1/1900 and the fractional part represents the fraction of the
     *        day since midnight. For example, a cell with date 11/3/2020 has the raw value "44138". A cell with the
     *        time 9:00 AM has the raw value "0.375" and a cell with date/time value of 11/3/2020 9:00 AM has the raw
     *        value "44138.375". Notice that even though the raw value is a number in all three cases, it is still
     *        represented as a string.
     *        </p>
     *        <p>
     *        Cells with format NUMBER, CURRENCY, PERCENTAGE and ACCOUNTING have the raw value of the data as the number
     *        representing the data being displayed. For example, the number 1.325 with two decimal places in the format
     *        will have it's raw value as "1.325" and formatted value as "1.33". A currency value for $10 will have the
     *        raw value as "10" and formatted value as "$10.00". A value representing 20% with two decimal places in the
     *        format will have its raw value as "0.2" and the formatted value as "20.00%". An accounting value of -$25
     *        will have "-25" as the raw value and "$ (25.00)" as the formatted value.
     *        </p>
     *        <p>
     *        Cells with format TEXT will have the raw text as the raw value. For example, a cell with text "John Smith"
     *        will have "John Smith" as both the raw value and the formatted value.
     *        </p>
     *        <p>
     *        Cells with format CONTACT will have the name of the contact as a formatted value and the email address of
     *        the contact as the raw value. For example, a contact for John Smith will have "John Smith" as the
     *        formatted value and "john.smith@example.com" as the raw value.
     *        </p>
     *        <p>
     *        Cells with format ROWLINK (aka picklist) will have the first column of the linked row as the formatted
     *        value and the row id of the linked row as the raw value. For example, a cell containing a picklist to a
     *        table that displays task status might have "Completed" as the formatted value and
     *        "row:dfcefaee-5b37-4355-8f28-40c3e4ff5dd4/ca432b2f-b8eb-431d-9fb5-cbe0342f9f03" as the raw value.
     *        </p>
     *        <p>
     *        Cells with format AUTO or cells without any format that are auto-detected as one of the formats above will
     *        contain the raw and formatted values as mentioned above, based on the auto-detected formats. If there is
     *        no auto-detected format, the raw and formatted values will be the same as the data in the cell.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cell withRawValue(String rawValue) {
        setRawValue(rawValue);
        return this;
    }

    /**
     * <p>
     * The formatted value of the cell. This is the value that you see displayed in the cell in the UI.
     * </p>
     * <p>
     * Note that the formatted value of a cell is always represented as a string irrespective of the data that is stored
     * in the cell. For example, if a cell contains a date, the formatted value of the cell is the string representation
     * of the formatted date being shown in the cell in the UI. See details in the rawValue field below for how cells of
     * different formats will have different raw and formatted values.
     * </p>
     * 
     * @param formattedValue
     *        The formatted value of the cell. This is the value that you see displayed in the cell in the UI. </p>
     *        <p>
     *        Note that the formatted value of a cell is always represented as a string irrespective of the data that is
     *        stored in the cell. For example, if a cell contains a date, the formatted value of the cell is the string
     *        representation of the formatted date being shown in the cell in the UI. See details in the rawValue field
     *        below for how cells of different formats will have different raw and formatted values.
     */

    public void setFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
    }

    /**
     * <p>
     * The formatted value of the cell. This is the value that you see displayed in the cell in the UI.
     * </p>
     * <p>
     * Note that the formatted value of a cell is always represented as a string irrespective of the data that is stored
     * in the cell. For example, if a cell contains a date, the formatted value of the cell is the string representation
     * of the formatted date being shown in the cell in the UI. See details in the rawValue field below for how cells of
     * different formats will have different raw and formatted values.
     * </p>
     * 
     * @return The formatted value of the cell. This is the value that you see displayed in the cell in the UI. </p>
     *         <p>
     *         Note that the formatted value of a cell is always represented as a string irrespective of the data that
     *         is stored in the cell. For example, if a cell contains a date, the formatted value of the cell is the
     *         string representation of the formatted date being shown in the cell in the UI. See details in the
     *         rawValue field below for how cells of different formats will have different raw and formatted values.
     */

    public String getFormattedValue() {
        return this.formattedValue;
    }

    /**
     * <p>
     * The formatted value of the cell. This is the value that you see displayed in the cell in the UI.
     * </p>
     * <p>
     * Note that the formatted value of a cell is always represented as a string irrespective of the data that is stored
     * in the cell. For example, if a cell contains a date, the formatted value of the cell is the string representation
     * of the formatted date being shown in the cell in the UI. See details in the rawValue field below for how cells of
     * different formats will have different raw and formatted values.
     * </p>
     * 
     * @param formattedValue
     *        The formatted value of the cell. This is the value that you see displayed in the cell in the UI. </p>
     *        <p>
     *        Note that the formatted value of a cell is always represented as a string irrespective of the data that is
     *        stored in the cell. For example, if a cell contains a date, the formatted value of the cell is the string
     *        representation of the formatted date being shown in the cell in the UI. See details in the rawValue field
     *        below for how cells of different formats will have different raw and formatted values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cell withFormattedValue(String formattedValue) {
        setFormattedValue(formattedValue);
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
        if (getFormula() != null)
            sb.append("Formula: ").append("***Sensitive Data Redacted***").append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getRawValue() != null)
            sb.append("RawValue: ").append(getRawValue()).append(",");
        if (getFormattedValue() != null)
            sb.append("FormattedValue: ").append(getFormattedValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cell == false)
            return false;
        Cell other = (Cell) obj;
        if (other.getFormula() == null ^ this.getFormula() == null)
            return false;
        if (other.getFormula() != null && other.getFormula().equals(this.getFormula()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getRawValue() == null ^ this.getRawValue() == null)
            return false;
        if (other.getRawValue() != null && other.getRawValue().equals(this.getRawValue()) == false)
            return false;
        if (other.getFormattedValue() == null ^ this.getFormattedValue() == null)
            return false;
        if (other.getFormattedValue() != null && other.getFormattedValue().equals(this.getFormattedValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormula() == null) ? 0 : getFormula().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getRawValue() == null) ? 0 : getRawValue().hashCode());
        hashCode = prime * hashCode + ((getFormattedValue() == null) ? 0 : getFormattedValue().hashCode());
        return hashCode;
    }

    @Override
    public Cell clone() {
        try {
            return (Cell) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.CellMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
