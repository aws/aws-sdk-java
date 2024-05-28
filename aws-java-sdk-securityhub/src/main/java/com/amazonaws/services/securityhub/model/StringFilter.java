/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A string filter for filtering Security Hub findings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StringFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StringFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The string filter value. Filter values are case sensitive. For example, the product name for control-based
     * findings is <code>Security Hub</code>. If you provide <code>security hub</code> as the filter value, there's no
     * match.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The condition to apply to a string value when filtering Security Hub findings.
     * </p>
     * <p>
     * To search for values that have the filter value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that include the filter value, use <code>CONTAINS</code>. For example, the filter
     * <code>Title CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that includes the string
     * CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, the filter
     * <code>AwsAccountId EQUALS 123456789012</code> only matches findings that have an account ID of
     * <code>123456789012</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that start with the filter value, use <code>PREFIX</code>. For example, the filter
     * <code>ResourceRegion PREFIX us</code> matches findings that have a <code>ResourceRegion</code> that starts with
     * <code>us</code>. A <code>ResourceRegion</code> that starts with a different value, such as <code>af</code>,
     * <code>ap</code>, or <code>ca</code>, doesn't match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>CONTAINS</code>, <code>EQUALS</code>, and <code>PREFIX</code> filters on the same field are joined by
     * <code>OR</code>. A finding matches if it matches any one of those filters. For example, the filters
     * <code>Title CONTAINS CloudFront OR Title CONTAINS CloudWatch</code> match a finding that includes either
     * <code>CloudFront</code>, <code>CloudWatch</code>, or both strings in the title.
     * </p>
     * <p>
     * To search for values that don’t have the filter value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that exclude the filter value, use <code>NOT_CONTAINS</code>. For example, the filter
     * <code>Title NOT_CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that excludes the
     * string CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, the filter
     * <code>AwsAccountId NOT_EQUALS 123456789012</code> only matches findings that have an account ID other than
     * <code>123456789012</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that don't start with the filter value, use <code>PREFIX_NOT_EQUALS</code>. For example, the
     * filter <code>ResourceRegion PREFIX_NOT_EQUALS us</code> matches findings with a <code>ResourceRegion</code> that
     * starts with a value other than <code>us</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NOT_CONTAINS</code>, <code>NOT_EQUALS</code>, and <code>PREFIX_NOT_EQUALS</code> filters on the same field
     * are joined by <code>AND</code>. A finding matches only if it matches all of those filters. For example, the
     * filters <code>Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch</code> match a finding that
     * excludes both <code>CloudFront</code> and <code>CloudWatch</code> in the title.
     * </p>
     * <p>
     * You can’t have both a <code>CONTAINS</code> filter and a <code>NOT_CONTAINS</code> filter on the same field.
     * Similarly, you can't provide both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> or
     * <code>PREFIX_NOT_EQUALS</code> filter on the same field. Combining filters in this way returns an error.
     * <code>CONTAINS</code> filters can only be used with other <code>CONTAINS</code> filters.
     * <code>NOT_CONTAINS</code> filters can only be used with other <code>NOT_CONTAINS</code> filters.
     * </p>
     * <p>
     * You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     * filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, and then the
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     * </p>
     * <p>
     * For example, for the following filters, Security Hub first identifies findings that have resource types that
     * start with either <code>AwsIam</code> or <code>AwsEc2</code>. It then excludes findings that have a resource type
     * of <code>AwsIamPolicy</code> and findings that have a resource type of <code>AwsEc2NetworkInterface</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceType PREFIX AwsIam</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType PREFIX AwsEc2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType NOT_EQUALS AwsIamPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType NOT_EQUALS AwsEc2NetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>CONTAINS</code> and <code>NOT_CONTAINS</code> operators can be used only with automation rules. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html">Automation rules</a> in the
     * <i>Security Hub User Guide</i>.
     * </p>
     */
    private String comparison;

    /**
     * <p>
     * The string filter value. Filter values are case sensitive. For example, the product name for control-based
     * findings is <code>Security Hub</code>. If you provide <code>security hub</code> as the filter value, there's no
     * match.
     * </p>
     * 
     * @param value
     *        The string filter value. Filter values are case sensitive. For example, the product name for control-based
     *        findings is <code>Security Hub</code>. If you provide <code>security hub</code> as the filter value,
     *        there's no match.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The string filter value. Filter values are case sensitive. For example, the product name for control-based
     * findings is <code>Security Hub</code>. If you provide <code>security hub</code> as the filter value, there's no
     * match.
     * </p>
     * 
     * @return The string filter value. Filter values are case sensitive. For example, the product name for
     *         control-based findings is <code>Security Hub</code>. If you provide <code>security hub</code> as the
     *         filter value, there's no match.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The string filter value. Filter values are case sensitive. For example, the product name for control-based
     * findings is <code>Security Hub</code>. If you provide <code>security hub</code> as the filter value, there's no
     * match.
     * </p>
     * 
     * @param value
     *        The string filter value. Filter values are case sensitive. For example, the product name for control-based
     *        findings is <code>Security Hub</code>. If you provide <code>security hub</code> as the filter value,
     *        there's no match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringFilter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The condition to apply to a string value when filtering Security Hub findings.
     * </p>
     * <p>
     * To search for values that have the filter value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that include the filter value, use <code>CONTAINS</code>. For example, the filter
     * <code>Title CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that includes the string
     * CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, the filter
     * <code>AwsAccountId EQUALS 123456789012</code> only matches findings that have an account ID of
     * <code>123456789012</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that start with the filter value, use <code>PREFIX</code>. For example, the filter
     * <code>ResourceRegion PREFIX us</code> matches findings that have a <code>ResourceRegion</code> that starts with
     * <code>us</code>. A <code>ResourceRegion</code> that starts with a different value, such as <code>af</code>,
     * <code>ap</code>, or <code>ca</code>, doesn't match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>CONTAINS</code>, <code>EQUALS</code>, and <code>PREFIX</code> filters on the same field are joined by
     * <code>OR</code>. A finding matches if it matches any one of those filters. For example, the filters
     * <code>Title CONTAINS CloudFront OR Title CONTAINS CloudWatch</code> match a finding that includes either
     * <code>CloudFront</code>, <code>CloudWatch</code>, or both strings in the title.
     * </p>
     * <p>
     * To search for values that don’t have the filter value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that exclude the filter value, use <code>NOT_CONTAINS</code>. For example, the filter
     * <code>Title NOT_CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that excludes the
     * string CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, the filter
     * <code>AwsAccountId NOT_EQUALS 123456789012</code> only matches findings that have an account ID other than
     * <code>123456789012</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that don't start with the filter value, use <code>PREFIX_NOT_EQUALS</code>. For example, the
     * filter <code>ResourceRegion PREFIX_NOT_EQUALS us</code> matches findings with a <code>ResourceRegion</code> that
     * starts with a value other than <code>us</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NOT_CONTAINS</code>, <code>NOT_EQUALS</code>, and <code>PREFIX_NOT_EQUALS</code> filters on the same field
     * are joined by <code>AND</code>. A finding matches only if it matches all of those filters. For example, the
     * filters <code>Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch</code> match a finding that
     * excludes both <code>CloudFront</code> and <code>CloudWatch</code> in the title.
     * </p>
     * <p>
     * You can’t have both a <code>CONTAINS</code> filter and a <code>NOT_CONTAINS</code> filter on the same field.
     * Similarly, you can't provide both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> or
     * <code>PREFIX_NOT_EQUALS</code> filter on the same field. Combining filters in this way returns an error.
     * <code>CONTAINS</code> filters can only be used with other <code>CONTAINS</code> filters.
     * <code>NOT_CONTAINS</code> filters can only be used with other <code>NOT_CONTAINS</code> filters.
     * </p>
     * <p>
     * You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     * filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, and then the
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     * </p>
     * <p>
     * For example, for the following filters, Security Hub first identifies findings that have resource types that
     * start with either <code>AwsIam</code> or <code>AwsEc2</code>. It then excludes findings that have a resource type
     * of <code>AwsIamPolicy</code> and findings that have a resource type of <code>AwsEc2NetworkInterface</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceType PREFIX AwsIam</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType PREFIX AwsEc2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType NOT_EQUALS AwsIamPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType NOT_EQUALS AwsEc2NetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>CONTAINS</code> and <code>NOT_CONTAINS</code> operators can be used only with automation rules. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html">Automation rules</a> in the
     * <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param comparison
     *        The condition to apply to a string value when filtering Security Hub findings.</p>
     *        <p>
     *        To search for values that have the filter value, use one of the following comparison operators:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To search for values that include the filter value, use <code>CONTAINS</code>. For example, the filter
     *        <code>Title CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that includes the
     *        string CloudFront.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, the filter
     *        <code>AwsAccountId EQUALS 123456789012</code> only matches findings that have an account ID of
     *        <code>123456789012</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that start with the filter value, use <code>PREFIX</code>. For example, the filter
     *        <code>ResourceRegion PREFIX us</code> matches findings that have a <code>ResourceRegion</code> that starts
     *        with <code>us</code>. A <code>ResourceRegion</code> that starts with a different value, such as
     *        <code>af</code>, <code>ap</code>, or <code>ca</code>, doesn't match.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>CONTAINS</code>, <code>EQUALS</code>, and <code>PREFIX</code> filters on the same field are joined
     *        by <code>OR</code>. A finding matches if it matches any one of those filters. For example, the filters
     *        <code>Title CONTAINS CloudFront OR Title CONTAINS CloudWatch</code> match a finding that includes either
     *        <code>CloudFront</code>, <code>CloudWatch</code>, or both strings in the title.
     *        </p>
     *        <p>
     *        To search for values that don’t have the filter value, use one of the following comparison operators:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To search for values that exclude the filter value, use <code>NOT_CONTAINS</code>. For example, the filter
     *        <code>Title NOT_CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that excludes
     *        the string CloudFront.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, the filter
     *        <code>AwsAccountId NOT_EQUALS 123456789012</code> only matches findings that have an account ID other than
     *        <code>123456789012</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that don't start with the filter value, use <code>PREFIX_NOT_EQUALS</code>. For
     *        example, the filter <code>ResourceRegion PREFIX_NOT_EQUALS us</code> matches findings with a
     *        <code>ResourceRegion</code> that starts with a value other than <code>us</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>NOT_CONTAINS</code>, <code>NOT_EQUALS</code>, and <code>PREFIX_NOT_EQUALS</code> filters on the same
     *        field are joined by <code>AND</code>. A finding matches only if it matches all of those filters. For
     *        example, the filters <code>Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch</code> match a
     *        finding that excludes both <code>CloudFront</code> and <code>CloudWatch</code> in the title.
     *        </p>
     *        <p>
     *        You can’t have both a <code>CONTAINS</code> filter and a <code>NOT_CONTAINS</code> filter on the same
     *        field. Similarly, you can't provide both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> or
     *        <code>PREFIX_NOT_EQUALS</code> filter on the same field. Combining filters in this way returns an error.
     *        <code>CONTAINS</code> filters can only be used with other <code>CONTAINS</code> filters.
     *        <code>NOT_CONTAINS</code> filters can only be used with other <code>NOT_CONTAINS</code> filters.
     *        </p>
     *        <p>
     *        You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     *        filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, and then the
     *        <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     *        </p>
     *        <p>
     *        For example, for the following filters, Security Hub first identifies findings that have resource types
     *        that start with either <code>AwsIam</code> or <code>AwsEc2</code>. It then excludes findings that have a
     *        resource type of <code>AwsIamPolicy</code> and findings that have a resource type of
     *        <code>AwsEc2NetworkInterface</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ResourceType PREFIX AwsIam</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType PREFIX AwsEc2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType NOT_EQUALS AwsIamPolicy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType NOT_EQUALS AwsEc2NetworkInterface</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>CONTAINS</code> and <code>NOT_CONTAINS</code> operators can be used only with automation rules. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html">Automation rules</a>
     *        in the <i>Security Hub User Guide</i>.
     * @see StringFilterComparison
     */

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    /**
     * <p>
     * The condition to apply to a string value when filtering Security Hub findings.
     * </p>
     * <p>
     * To search for values that have the filter value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that include the filter value, use <code>CONTAINS</code>. For example, the filter
     * <code>Title CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that includes the string
     * CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, the filter
     * <code>AwsAccountId EQUALS 123456789012</code> only matches findings that have an account ID of
     * <code>123456789012</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that start with the filter value, use <code>PREFIX</code>. For example, the filter
     * <code>ResourceRegion PREFIX us</code> matches findings that have a <code>ResourceRegion</code> that starts with
     * <code>us</code>. A <code>ResourceRegion</code> that starts with a different value, such as <code>af</code>,
     * <code>ap</code>, or <code>ca</code>, doesn't match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>CONTAINS</code>, <code>EQUALS</code>, and <code>PREFIX</code> filters on the same field are joined by
     * <code>OR</code>. A finding matches if it matches any one of those filters. For example, the filters
     * <code>Title CONTAINS CloudFront OR Title CONTAINS CloudWatch</code> match a finding that includes either
     * <code>CloudFront</code>, <code>CloudWatch</code>, or both strings in the title.
     * </p>
     * <p>
     * To search for values that don’t have the filter value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that exclude the filter value, use <code>NOT_CONTAINS</code>. For example, the filter
     * <code>Title NOT_CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that excludes the
     * string CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, the filter
     * <code>AwsAccountId NOT_EQUALS 123456789012</code> only matches findings that have an account ID other than
     * <code>123456789012</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that don't start with the filter value, use <code>PREFIX_NOT_EQUALS</code>. For example, the
     * filter <code>ResourceRegion PREFIX_NOT_EQUALS us</code> matches findings with a <code>ResourceRegion</code> that
     * starts with a value other than <code>us</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NOT_CONTAINS</code>, <code>NOT_EQUALS</code>, and <code>PREFIX_NOT_EQUALS</code> filters on the same field
     * are joined by <code>AND</code>. A finding matches only if it matches all of those filters. For example, the
     * filters <code>Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch</code> match a finding that
     * excludes both <code>CloudFront</code> and <code>CloudWatch</code> in the title.
     * </p>
     * <p>
     * You can’t have both a <code>CONTAINS</code> filter and a <code>NOT_CONTAINS</code> filter on the same field.
     * Similarly, you can't provide both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> or
     * <code>PREFIX_NOT_EQUALS</code> filter on the same field. Combining filters in this way returns an error.
     * <code>CONTAINS</code> filters can only be used with other <code>CONTAINS</code> filters.
     * <code>NOT_CONTAINS</code> filters can only be used with other <code>NOT_CONTAINS</code> filters.
     * </p>
     * <p>
     * You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     * filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, and then the
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     * </p>
     * <p>
     * For example, for the following filters, Security Hub first identifies findings that have resource types that
     * start with either <code>AwsIam</code> or <code>AwsEc2</code>. It then excludes findings that have a resource type
     * of <code>AwsIamPolicy</code> and findings that have a resource type of <code>AwsEc2NetworkInterface</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceType PREFIX AwsIam</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType PREFIX AwsEc2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType NOT_EQUALS AwsIamPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType NOT_EQUALS AwsEc2NetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>CONTAINS</code> and <code>NOT_CONTAINS</code> operators can be used only with automation rules. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html">Automation rules</a> in the
     * <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @return The condition to apply to a string value when filtering Security Hub findings.</p>
     *         <p>
     *         To search for values that have the filter value, use one of the following comparison operators:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To search for values that include the filter value, use <code>CONTAINS</code>. For example, the filter
     *         <code>Title CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that includes the
     *         string CloudFront.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, the
     *         filter <code>AwsAccountId EQUALS 123456789012</code> only matches findings that have an account ID of
     *         <code>123456789012</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To search for values that start with the filter value, use <code>PREFIX</code>. For example, the filter
     *         <code>ResourceRegion PREFIX us</code> matches findings that have a <code>ResourceRegion</code> that
     *         starts with <code>us</code>. A <code>ResourceRegion</code> that starts with a different value, such as
     *         <code>af</code>, <code>ap</code>, or <code>ca</code>, doesn't match.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>CONTAINS</code>, <code>EQUALS</code>, and <code>PREFIX</code> filters on the same field are joined
     *         by <code>OR</code>. A finding matches if it matches any one of those filters. For example, the filters
     *         <code>Title CONTAINS CloudFront OR Title CONTAINS CloudWatch</code> match a finding that includes either
     *         <code>CloudFront</code>, <code>CloudWatch</code>, or both strings in the title.
     *         </p>
     *         <p>
     *         To search for values that don’t have the filter value, use one of the following comparison operators:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To search for values that exclude the filter value, use <code>NOT_CONTAINS</code>. For example, the
     *         filter <code>Title NOT_CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that
     *         excludes the string CloudFront.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, the filter
     *         <code>AwsAccountId NOT_EQUALS 123456789012</code> only matches findings that have an account ID other
     *         than <code>123456789012</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To search for values that don't start with the filter value, use <code>PREFIX_NOT_EQUALS</code>. For
     *         example, the filter <code>ResourceRegion PREFIX_NOT_EQUALS us</code> matches findings with a
     *         <code>ResourceRegion</code> that starts with a value other than <code>us</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>NOT_CONTAINS</code>, <code>NOT_EQUALS</code>, and <code>PREFIX_NOT_EQUALS</code> filters on the
     *         same field are joined by <code>AND</code>. A finding matches only if it matches all of those filters. For
     *         example, the filters <code>Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch</code> match a
     *         finding that excludes both <code>CloudFront</code> and <code>CloudWatch</code> in the title.
     *         </p>
     *         <p>
     *         You can’t have both a <code>CONTAINS</code> filter and a <code>NOT_CONTAINS</code> filter on the same
     *         field. Similarly, you can't provide both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> or
     *         <code>PREFIX_NOT_EQUALS</code> filter on the same field. Combining filters in this way returns an error.
     *         <code>CONTAINS</code> filters can only be used with other <code>CONTAINS</code> filters.
     *         <code>NOT_CONTAINS</code> filters can only be used with other <code>NOT_CONTAINS</code> filters.
     *         </p>
     *         <p>
     *         You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or
     *         <code>PREFIX_NOT_EQUALS</code> filters for the same field. Security Hub first processes the
     *         <code>PREFIX</code> filters, and then the <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     *         filters.
     *         </p>
     *         <p>
     *         For example, for the following filters, Security Hub first identifies findings that have resource types
     *         that start with either <code>AwsIam</code> or <code>AwsEc2</code>. It then excludes findings that have a
     *         resource type of <code>AwsIamPolicy</code> and findings that have a resource type of
     *         <code>AwsEc2NetworkInterface</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ResourceType PREFIX AwsIam</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResourceType PREFIX AwsEc2</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResourceType NOT_EQUALS AwsIamPolicy</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResourceType NOT_EQUALS AwsEc2NetworkInterface</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>CONTAINS</code> and <code>NOT_CONTAINS</code> operators can be used only with automation rules. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html">Automation
     *         rules</a> in the <i>Security Hub User Guide</i>.
     * @see StringFilterComparison
     */

    public String getComparison() {
        return this.comparison;
    }

    /**
     * <p>
     * The condition to apply to a string value when filtering Security Hub findings.
     * </p>
     * <p>
     * To search for values that have the filter value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that include the filter value, use <code>CONTAINS</code>. For example, the filter
     * <code>Title CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that includes the string
     * CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, the filter
     * <code>AwsAccountId EQUALS 123456789012</code> only matches findings that have an account ID of
     * <code>123456789012</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that start with the filter value, use <code>PREFIX</code>. For example, the filter
     * <code>ResourceRegion PREFIX us</code> matches findings that have a <code>ResourceRegion</code> that starts with
     * <code>us</code>. A <code>ResourceRegion</code> that starts with a different value, such as <code>af</code>,
     * <code>ap</code>, or <code>ca</code>, doesn't match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>CONTAINS</code>, <code>EQUALS</code>, and <code>PREFIX</code> filters on the same field are joined by
     * <code>OR</code>. A finding matches if it matches any one of those filters. For example, the filters
     * <code>Title CONTAINS CloudFront OR Title CONTAINS CloudWatch</code> match a finding that includes either
     * <code>CloudFront</code>, <code>CloudWatch</code>, or both strings in the title.
     * </p>
     * <p>
     * To search for values that don’t have the filter value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that exclude the filter value, use <code>NOT_CONTAINS</code>. For example, the filter
     * <code>Title NOT_CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that excludes the
     * string CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, the filter
     * <code>AwsAccountId NOT_EQUALS 123456789012</code> only matches findings that have an account ID other than
     * <code>123456789012</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that don't start with the filter value, use <code>PREFIX_NOT_EQUALS</code>. For example, the
     * filter <code>ResourceRegion PREFIX_NOT_EQUALS us</code> matches findings with a <code>ResourceRegion</code> that
     * starts with a value other than <code>us</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NOT_CONTAINS</code>, <code>NOT_EQUALS</code>, and <code>PREFIX_NOT_EQUALS</code> filters on the same field
     * are joined by <code>AND</code>. A finding matches only if it matches all of those filters. For example, the
     * filters <code>Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch</code> match a finding that
     * excludes both <code>CloudFront</code> and <code>CloudWatch</code> in the title.
     * </p>
     * <p>
     * You can’t have both a <code>CONTAINS</code> filter and a <code>NOT_CONTAINS</code> filter on the same field.
     * Similarly, you can't provide both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> or
     * <code>PREFIX_NOT_EQUALS</code> filter on the same field. Combining filters in this way returns an error.
     * <code>CONTAINS</code> filters can only be used with other <code>CONTAINS</code> filters.
     * <code>NOT_CONTAINS</code> filters can only be used with other <code>NOT_CONTAINS</code> filters.
     * </p>
     * <p>
     * You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     * filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, and then the
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     * </p>
     * <p>
     * For example, for the following filters, Security Hub first identifies findings that have resource types that
     * start with either <code>AwsIam</code> or <code>AwsEc2</code>. It then excludes findings that have a resource type
     * of <code>AwsIamPolicy</code> and findings that have a resource type of <code>AwsEc2NetworkInterface</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceType PREFIX AwsIam</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType PREFIX AwsEc2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType NOT_EQUALS AwsIamPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType NOT_EQUALS AwsEc2NetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>CONTAINS</code> and <code>NOT_CONTAINS</code> operators can be used only with automation rules. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html">Automation rules</a> in the
     * <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param comparison
     *        The condition to apply to a string value when filtering Security Hub findings.</p>
     *        <p>
     *        To search for values that have the filter value, use one of the following comparison operators:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To search for values that include the filter value, use <code>CONTAINS</code>. For example, the filter
     *        <code>Title CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that includes the
     *        string CloudFront.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, the filter
     *        <code>AwsAccountId EQUALS 123456789012</code> only matches findings that have an account ID of
     *        <code>123456789012</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that start with the filter value, use <code>PREFIX</code>. For example, the filter
     *        <code>ResourceRegion PREFIX us</code> matches findings that have a <code>ResourceRegion</code> that starts
     *        with <code>us</code>. A <code>ResourceRegion</code> that starts with a different value, such as
     *        <code>af</code>, <code>ap</code>, or <code>ca</code>, doesn't match.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>CONTAINS</code>, <code>EQUALS</code>, and <code>PREFIX</code> filters on the same field are joined
     *        by <code>OR</code>. A finding matches if it matches any one of those filters. For example, the filters
     *        <code>Title CONTAINS CloudFront OR Title CONTAINS CloudWatch</code> match a finding that includes either
     *        <code>CloudFront</code>, <code>CloudWatch</code>, or both strings in the title.
     *        </p>
     *        <p>
     *        To search for values that don’t have the filter value, use one of the following comparison operators:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To search for values that exclude the filter value, use <code>NOT_CONTAINS</code>. For example, the filter
     *        <code>Title NOT_CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that excludes
     *        the string CloudFront.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, the filter
     *        <code>AwsAccountId NOT_EQUALS 123456789012</code> only matches findings that have an account ID other than
     *        <code>123456789012</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that don't start with the filter value, use <code>PREFIX_NOT_EQUALS</code>. For
     *        example, the filter <code>ResourceRegion PREFIX_NOT_EQUALS us</code> matches findings with a
     *        <code>ResourceRegion</code> that starts with a value other than <code>us</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>NOT_CONTAINS</code>, <code>NOT_EQUALS</code>, and <code>PREFIX_NOT_EQUALS</code> filters on the same
     *        field are joined by <code>AND</code>. A finding matches only if it matches all of those filters. For
     *        example, the filters <code>Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch</code> match a
     *        finding that excludes both <code>CloudFront</code> and <code>CloudWatch</code> in the title.
     *        </p>
     *        <p>
     *        You can’t have both a <code>CONTAINS</code> filter and a <code>NOT_CONTAINS</code> filter on the same
     *        field. Similarly, you can't provide both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> or
     *        <code>PREFIX_NOT_EQUALS</code> filter on the same field. Combining filters in this way returns an error.
     *        <code>CONTAINS</code> filters can only be used with other <code>CONTAINS</code> filters.
     *        <code>NOT_CONTAINS</code> filters can only be used with other <code>NOT_CONTAINS</code> filters.
     *        </p>
     *        <p>
     *        You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     *        filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, and then the
     *        <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     *        </p>
     *        <p>
     *        For example, for the following filters, Security Hub first identifies findings that have resource types
     *        that start with either <code>AwsIam</code> or <code>AwsEc2</code>. It then excludes findings that have a
     *        resource type of <code>AwsIamPolicy</code> and findings that have a resource type of
     *        <code>AwsEc2NetworkInterface</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ResourceType PREFIX AwsIam</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType PREFIX AwsEc2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType NOT_EQUALS AwsIamPolicy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType NOT_EQUALS AwsEc2NetworkInterface</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>CONTAINS</code> and <code>NOT_CONTAINS</code> operators can be used only with automation rules. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html">Automation rules</a>
     *        in the <i>Security Hub User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StringFilterComparison
     */

    public StringFilter withComparison(String comparison) {
        setComparison(comparison);
        return this;
    }

    /**
     * <p>
     * The condition to apply to a string value when filtering Security Hub findings.
     * </p>
     * <p>
     * To search for values that have the filter value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that include the filter value, use <code>CONTAINS</code>. For example, the filter
     * <code>Title CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that includes the string
     * CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, the filter
     * <code>AwsAccountId EQUALS 123456789012</code> only matches findings that have an account ID of
     * <code>123456789012</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that start with the filter value, use <code>PREFIX</code>. For example, the filter
     * <code>ResourceRegion PREFIX us</code> matches findings that have a <code>ResourceRegion</code> that starts with
     * <code>us</code>. A <code>ResourceRegion</code> that starts with a different value, such as <code>af</code>,
     * <code>ap</code>, or <code>ca</code>, doesn't match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>CONTAINS</code>, <code>EQUALS</code>, and <code>PREFIX</code> filters on the same field are joined by
     * <code>OR</code>. A finding matches if it matches any one of those filters. For example, the filters
     * <code>Title CONTAINS CloudFront OR Title CONTAINS CloudWatch</code> match a finding that includes either
     * <code>CloudFront</code>, <code>CloudWatch</code>, or both strings in the title.
     * </p>
     * <p>
     * To search for values that don’t have the filter value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that exclude the filter value, use <code>NOT_CONTAINS</code>. For example, the filter
     * <code>Title NOT_CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that excludes the
     * string CloudFront.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, the filter
     * <code>AwsAccountId NOT_EQUALS 123456789012</code> only matches findings that have an account ID other than
     * <code>123456789012</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that don't start with the filter value, use <code>PREFIX_NOT_EQUALS</code>. For example, the
     * filter <code>ResourceRegion PREFIX_NOT_EQUALS us</code> matches findings with a <code>ResourceRegion</code> that
     * starts with a value other than <code>us</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NOT_CONTAINS</code>, <code>NOT_EQUALS</code>, and <code>PREFIX_NOT_EQUALS</code> filters on the same field
     * are joined by <code>AND</code>. A finding matches only if it matches all of those filters. For example, the
     * filters <code>Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch</code> match a finding that
     * excludes both <code>CloudFront</code> and <code>CloudWatch</code> in the title.
     * </p>
     * <p>
     * You can’t have both a <code>CONTAINS</code> filter and a <code>NOT_CONTAINS</code> filter on the same field.
     * Similarly, you can't provide both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> or
     * <code>PREFIX_NOT_EQUALS</code> filter on the same field. Combining filters in this way returns an error.
     * <code>CONTAINS</code> filters can only be used with other <code>CONTAINS</code> filters.
     * <code>NOT_CONTAINS</code> filters can only be used with other <code>NOT_CONTAINS</code> filters.
     * </p>
     * <p>
     * You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     * filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, and then the
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     * </p>
     * <p>
     * For example, for the following filters, Security Hub first identifies findings that have resource types that
     * start with either <code>AwsIam</code> or <code>AwsEc2</code>. It then excludes findings that have a resource type
     * of <code>AwsIamPolicy</code> and findings that have a resource type of <code>AwsEc2NetworkInterface</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceType PREFIX AwsIam</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType PREFIX AwsEc2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType NOT_EQUALS AwsIamPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType NOT_EQUALS AwsEc2NetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>CONTAINS</code> and <code>NOT_CONTAINS</code> operators can be used only with automation rules. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html">Automation rules</a> in the
     * <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param comparison
     *        The condition to apply to a string value when filtering Security Hub findings.</p>
     *        <p>
     *        To search for values that have the filter value, use one of the following comparison operators:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To search for values that include the filter value, use <code>CONTAINS</code>. For example, the filter
     *        <code>Title CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that includes the
     *        string CloudFront.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, the filter
     *        <code>AwsAccountId EQUALS 123456789012</code> only matches findings that have an account ID of
     *        <code>123456789012</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that start with the filter value, use <code>PREFIX</code>. For example, the filter
     *        <code>ResourceRegion PREFIX us</code> matches findings that have a <code>ResourceRegion</code> that starts
     *        with <code>us</code>. A <code>ResourceRegion</code> that starts with a different value, such as
     *        <code>af</code>, <code>ap</code>, or <code>ca</code>, doesn't match.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>CONTAINS</code>, <code>EQUALS</code>, and <code>PREFIX</code> filters on the same field are joined
     *        by <code>OR</code>. A finding matches if it matches any one of those filters. For example, the filters
     *        <code>Title CONTAINS CloudFront OR Title CONTAINS CloudWatch</code> match a finding that includes either
     *        <code>CloudFront</code>, <code>CloudWatch</code>, or both strings in the title.
     *        </p>
     *        <p>
     *        To search for values that don’t have the filter value, use one of the following comparison operators:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To search for values that exclude the filter value, use <code>NOT_CONTAINS</code>. For example, the filter
     *        <code>Title NOT_CONTAINS CloudFront</code> matches findings that have a <code>Title</code> that excludes
     *        the string CloudFront.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, the filter
     *        <code>AwsAccountId NOT_EQUALS 123456789012</code> only matches findings that have an account ID other than
     *        <code>123456789012</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that don't start with the filter value, use <code>PREFIX_NOT_EQUALS</code>. For
     *        example, the filter <code>ResourceRegion PREFIX_NOT_EQUALS us</code> matches findings with a
     *        <code>ResourceRegion</code> that starts with a value other than <code>us</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>NOT_CONTAINS</code>, <code>NOT_EQUALS</code>, and <code>PREFIX_NOT_EQUALS</code> filters on the same
     *        field are joined by <code>AND</code>. A finding matches only if it matches all of those filters. For
     *        example, the filters <code>Title NOT_CONTAINS CloudFront AND Title NOT_CONTAINS CloudWatch</code> match a
     *        finding that excludes both <code>CloudFront</code> and <code>CloudWatch</code> in the title.
     *        </p>
     *        <p>
     *        You can’t have both a <code>CONTAINS</code> filter and a <code>NOT_CONTAINS</code> filter on the same
     *        field. Similarly, you can't provide both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> or
     *        <code>PREFIX_NOT_EQUALS</code> filter on the same field. Combining filters in this way returns an error.
     *        <code>CONTAINS</code> filters can only be used with other <code>CONTAINS</code> filters.
     *        <code>NOT_CONTAINS</code> filters can only be used with other <code>NOT_CONTAINS</code> filters.
     *        </p>
     *        <p>
     *        You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     *        filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, and then the
     *        <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     *        </p>
     *        <p>
     *        For example, for the following filters, Security Hub first identifies findings that have resource types
     *        that start with either <code>AwsIam</code> or <code>AwsEc2</code>. It then excludes findings that have a
     *        resource type of <code>AwsIamPolicy</code> and findings that have a resource type of
     *        <code>AwsEc2NetworkInterface</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ResourceType PREFIX AwsIam</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType PREFIX AwsEc2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType NOT_EQUALS AwsIamPolicy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType NOT_EQUALS AwsEc2NetworkInterface</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>CONTAINS</code> and <code>NOT_CONTAINS</code> operators can be used only with automation rules. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html">Automation rules</a>
     *        in the <i>Security Hub User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StringFilterComparison
     */

    public StringFilter withComparison(StringFilterComparison comparison) {
        this.comparison = comparison.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getComparison() != null)
            sb.append("Comparison: ").append(getComparison());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StringFilter == false)
            return false;
        StringFilter other = (StringFilter) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getComparison() == null ^ this.getComparison() == null)
            return false;
        if (other.getComparison() != null && other.getComparison().equals(this.getComparison()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getComparison() == null) ? 0 : getComparison().hashCode());
        return hashCode;
    }

    @Override
    public StringFilter clone() {
        try {
            return (StringFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.StringFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
