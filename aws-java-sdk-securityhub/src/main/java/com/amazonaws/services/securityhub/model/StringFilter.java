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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A string filter for querying findings.
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
     * findings is <code>Security Hub</code>. If you provide <code>security hub</code> as the filter text, then there is
     * no match.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The condition to apply to a string value when querying for findings. To search for values that contain the filter
     * criteria value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType EQUALS AwsEc2SecurityGroup</code> only matches findings that have a
     * resource type of <code>AwsEc2SecurityGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that start with the filter value, use <code>PREFIX</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType PREFIX AwsIam</code> matches findings that have a resource type that
     * starts with <code>AwsIam</code>. Findings with a resource type of <code>AwsIamPolicy</code>,
     * <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EQUALS</code> and <code>PREFIX</code> filters on the same field are joined by <code>OR</code>. A finding
     * matches if it matches any one of those filters.
     * </p>
     * <p>
     * To search for values that do not contain the filter criteria value, use one of the following comparison
     * operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that do not exactly match the filter value, use <code>NOT_EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType NOT_EQUALS AwsIamPolicy</code> matches findings that have a resource
     * type other than <code>AwsIamPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that do not start with the filter value, use <code>PREFIX_NOT_EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType PREFIX_NOT_EQUALS AwsIam</code> matches findings that have a resource
     * type that does not start with <code>AwsIam</code>. Findings with a resource type of <code>AwsIamPolicy</code>,
     * <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all be excluded from the results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NOT_EQUALS</code> and <code>PREFIX_NOT_EQUALS</code> filters on the same field are joined by
     * <code>AND</code>. A finding matches only if it matches all of those filters.
     * </p>
     * <p>
     * For filters on the same field, you cannot provide both an <code>EQUALS</code> filter and a
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filter. Combining filters in this way always returns an
     * error, even if the provided filter values would return valid results.
     * </p>
     * <p>
     * You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     * filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, then the
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     * </p>
     * <p>
     * For example, for the following filter, Security Hub first identifies findings that have resource types that start
     * with either <code>AwsIAM</code> or <code>AwsEc2</code>. It then excludes findings that have a resource type of
     * <code>AwsIamPolicy</code> and findings that have a resource type of <code>AwsEc2NetworkInterface</code>.
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
     */
    private String comparison;

    /**
     * <p>
     * The string filter value. Filter values are case sensitive. For example, the product name for control-based
     * findings is <code>Security Hub</code>. If you provide <code>security hub</code> as the filter text, then there is
     * no match.
     * </p>
     * 
     * @param value
     *        The string filter value. Filter values are case sensitive. For example, the product name for control-based
     *        findings is <code>Security Hub</code>. If you provide <code>security hub</code> as the filter text, then
     *        there is no match.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The string filter value. Filter values are case sensitive. For example, the product name for control-based
     * findings is <code>Security Hub</code>. If you provide <code>security hub</code> as the filter text, then there is
     * no match.
     * </p>
     * 
     * @return The string filter value. Filter values are case sensitive. For example, the product name for
     *         control-based findings is <code>Security Hub</code>. If you provide <code>security hub</code> as the
     *         filter text, then there is no match.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The string filter value. Filter values are case sensitive. For example, the product name for control-based
     * findings is <code>Security Hub</code>. If you provide <code>security hub</code> as the filter text, then there is
     * no match.
     * </p>
     * 
     * @param value
     *        The string filter value. Filter values are case sensitive. For example, the product name for control-based
     *        findings is <code>Security Hub</code>. If you provide <code>security hub</code> as the filter text, then
     *        there is no match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringFilter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The condition to apply to a string value when querying for findings. To search for values that contain the filter
     * criteria value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType EQUALS AwsEc2SecurityGroup</code> only matches findings that have a
     * resource type of <code>AwsEc2SecurityGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that start with the filter value, use <code>PREFIX</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType PREFIX AwsIam</code> matches findings that have a resource type that
     * starts with <code>AwsIam</code>. Findings with a resource type of <code>AwsIamPolicy</code>,
     * <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EQUALS</code> and <code>PREFIX</code> filters on the same field are joined by <code>OR</code>. A finding
     * matches if it matches any one of those filters.
     * </p>
     * <p>
     * To search for values that do not contain the filter criteria value, use one of the following comparison
     * operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that do not exactly match the filter value, use <code>NOT_EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType NOT_EQUALS AwsIamPolicy</code> matches findings that have a resource
     * type other than <code>AwsIamPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that do not start with the filter value, use <code>PREFIX_NOT_EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType PREFIX_NOT_EQUALS AwsIam</code> matches findings that have a resource
     * type that does not start with <code>AwsIam</code>. Findings with a resource type of <code>AwsIamPolicy</code>,
     * <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all be excluded from the results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NOT_EQUALS</code> and <code>PREFIX_NOT_EQUALS</code> filters on the same field are joined by
     * <code>AND</code>. A finding matches only if it matches all of those filters.
     * </p>
     * <p>
     * For filters on the same field, you cannot provide both an <code>EQUALS</code> filter and a
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filter. Combining filters in this way always returns an
     * error, even if the provided filter values would return valid results.
     * </p>
     * <p>
     * You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     * filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, then the
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     * </p>
     * <p>
     * For example, for the following filter, Security Hub first identifies findings that have resource types that start
     * with either <code>AwsIAM</code> or <code>AwsEc2</code>. It then excludes findings that have a resource type of
     * <code>AwsIamPolicy</code> and findings that have a resource type of <code>AwsEc2NetworkInterface</code>.
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
     * 
     * @param comparison
     *        The condition to apply to a string value when querying for findings. To search for values that contain the
     *        filter criteria value, use one of the following comparison operators:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To search for values that exactly match the filter value, use <code>EQUALS</code>.
     *        </p>
     *        <p>
     *        For example, the filter <code>ResourceType EQUALS AwsEc2SecurityGroup</code> only matches findings that
     *        have a resource type of <code>AwsEc2SecurityGroup</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that start with the filter value, use <code>PREFIX</code>.
     *        </p>
     *        <p>
     *        For example, the filter <code>ResourceType PREFIX AwsIam</code> matches findings that have a resource type
     *        that starts with <code>AwsIam</code>. Findings with a resource type of <code>AwsIamPolicy</code>,
     *        <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all match.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>EQUALS</code> and <code>PREFIX</code> filters on the same field are joined by <code>OR</code>. A
     *        finding matches if it matches any one of those filters.
     *        </p>
     *        <p>
     *        To search for values that do not contain the filter criteria value, use one of the following comparison
     *        operators:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To search for values that do not exactly match the filter value, use <code>NOT_EQUALS</code>.
     *        </p>
     *        <p>
     *        For example, the filter <code>ResourceType NOT_EQUALS AwsIamPolicy</code> matches findings that have a
     *        resource type other than <code>AwsIamPolicy</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that do not start with the filter value, use <code>PREFIX_NOT_EQUALS</code>.
     *        </p>
     *        <p>
     *        For example, the filter <code>ResourceType PREFIX_NOT_EQUALS AwsIam</code> matches findings that have a
     *        resource type that does not start with <code>AwsIam</code>. Findings with a resource type of
     *        <code>AwsIamPolicy</code>, <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all be excluded from
     *        the results.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>NOT_EQUALS</code> and <code>PREFIX_NOT_EQUALS</code> filters on the same field are joined by
     *        <code>AND</code>. A finding matches only if it matches all of those filters.
     *        </p>
     *        <p>
     *        For filters on the same field, you cannot provide both an <code>EQUALS</code> filter and a
     *        <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filter. Combining filters in this way always
     *        returns an error, even if the provided filter values would return valid results.
     *        </p>
     *        <p>
     *        You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     *        filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, then the
     *        <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     *        </p>
     *        <p>
     *        For example, for the following filter, Security Hub first identifies findings that have resource types
     *        that start with either <code>AwsIAM</code> or <code>AwsEc2</code>. It then excludes findings that have a
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
     * @see StringFilterComparison
     */

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    /**
     * <p>
     * The condition to apply to a string value when querying for findings. To search for values that contain the filter
     * criteria value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType EQUALS AwsEc2SecurityGroup</code> only matches findings that have a
     * resource type of <code>AwsEc2SecurityGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that start with the filter value, use <code>PREFIX</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType PREFIX AwsIam</code> matches findings that have a resource type that
     * starts with <code>AwsIam</code>. Findings with a resource type of <code>AwsIamPolicy</code>,
     * <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EQUALS</code> and <code>PREFIX</code> filters on the same field are joined by <code>OR</code>. A finding
     * matches if it matches any one of those filters.
     * </p>
     * <p>
     * To search for values that do not contain the filter criteria value, use one of the following comparison
     * operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that do not exactly match the filter value, use <code>NOT_EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType NOT_EQUALS AwsIamPolicy</code> matches findings that have a resource
     * type other than <code>AwsIamPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that do not start with the filter value, use <code>PREFIX_NOT_EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType PREFIX_NOT_EQUALS AwsIam</code> matches findings that have a resource
     * type that does not start with <code>AwsIam</code>. Findings with a resource type of <code>AwsIamPolicy</code>,
     * <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all be excluded from the results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NOT_EQUALS</code> and <code>PREFIX_NOT_EQUALS</code> filters on the same field are joined by
     * <code>AND</code>. A finding matches only if it matches all of those filters.
     * </p>
     * <p>
     * For filters on the same field, you cannot provide both an <code>EQUALS</code> filter and a
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filter. Combining filters in this way always returns an
     * error, even if the provided filter values would return valid results.
     * </p>
     * <p>
     * You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     * filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, then the
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     * </p>
     * <p>
     * For example, for the following filter, Security Hub first identifies findings that have resource types that start
     * with either <code>AwsIAM</code> or <code>AwsEc2</code>. It then excludes findings that have a resource type of
     * <code>AwsIamPolicy</code> and findings that have a resource type of <code>AwsEc2NetworkInterface</code>.
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
     * 
     * @return The condition to apply to a string value when querying for findings. To search for values that contain
     *         the filter criteria value, use one of the following comparison operators:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To search for values that exactly match the filter value, use <code>EQUALS</code>.
     *         </p>
     *         <p>
     *         For example, the filter <code>ResourceType EQUALS AwsEc2SecurityGroup</code> only matches findings that
     *         have a resource type of <code>AwsEc2SecurityGroup</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To search for values that start with the filter value, use <code>PREFIX</code>.
     *         </p>
     *         <p>
     *         For example, the filter <code>ResourceType PREFIX AwsIam</code> matches findings that have a resource
     *         type that starts with <code>AwsIam</code>. Findings with a resource type of <code>AwsIamPolicy</code>,
     *         <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all match.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>EQUALS</code> and <code>PREFIX</code> filters on the same field are joined by <code>OR</code>. A
     *         finding matches if it matches any one of those filters.
     *         </p>
     *         <p>
     *         To search for values that do not contain the filter criteria value, use one of the following comparison
     *         operators:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To search for values that do not exactly match the filter value, use <code>NOT_EQUALS</code>.
     *         </p>
     *         <p>
     *         For example, the filter <code>ResourceType NOT_EQUALS AwsIamPolicy</code> matches findings that have a
     *         resource type other than <code>AwsIamPolicy</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To search for values that do not start with the filter value, use <code>PREFIX_NOT_EQUALS</code>.
     *         </p>
     *         <p>
     *         For example, the filter <code>ResourceType PREFIX_NOT_EQUALS AwsIam</code> matches findings that have a
     *         resource type that does not start with <code>AwsIam</code>. Findings with a resource type of
     *         <code>AwsIamPolicy</code>, <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all be excluded from
     *         the results.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>NOT_EQUALS</code> and <code>PREFIX_NOT_EQUALS</code> filters on the same field are joined by
     *         <code>AND</code>. A finding matches only if it matches all of those filters.
     *         </p>
     *         <p>
     *         For filters on the same field, you cannot provide both an <code>EQUALS</code> filter and a
     *         <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filter. Combining filters in this way always
     *         returns an error, even if the provided filter values would return valid results.
     *         </p>
     *         <p>
     *         You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or
     *         <code>PREFIX_NOT_EQUALS</code> filters for the same field. Security Hub first processes the
     *         <code>PREFIX</code> filters, then the <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     *         </p>
     *         <p>
     *         For example, for the following filter, Security Hub first identifies findings that have resource types
     *         that start with either <code>AwsIAM</code> or <code>AwsEc2</code>. It then excludes findings that have a
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
     * @see StringFilterComparison
     */

    public String getComparison() {
        return this.comparison;
    }

    /**
     * <p>
     * The condition to apply to a string value when querying for findings. To search for values that contain the filter
     * criteria value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType EQUALS AwsEc2SecurityGroup</code> only matches findings that have a
     * resource type of <code>AwsEc2SecurityGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that start with the filter value, use <code>PREFIX</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType PREFIX AwsIam</code> matches findings that have a resource type that
     * starts with <code>AwsIam</code>. Findings with a resource type of <code>AwsIamPolicy</code>,
     * <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EQUALS</code> and <code>PREFIX</code> filters on the same field are joined by <code>OR</code>. A finding
     * matches if it matches any one of those filters.
     * </p>
     * <p>
     * To search for values that do not contain the filter criteria value, use one of the following comparison
     * operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that do not exactly match the filter value, use <code>NOT_EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType NOT_EQUALS AwsIamPolicy</code> matches findings that have a resource
     * type other than <code>AwsIamPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that do not start with the filter value, use <code>PREFIX_NOT_EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType PREFIX_NOT_EQUALS AwsIam</code> matches findings that have a resource
     * type that does not start with <code>AwsIam</code>. Findings with a resource type of <code>AwsIamPolicy</code>,
     * <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all be excluded from the results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NOT_EQUALS</code> and <code>PREFIX_NOT_EQUALS</code> filters on the same field are joined by
     * <code>AND</code>. A finding matches only if it matches all of those filters.
     * </p>
     * <p>
     * For filters on the same field, you cannot provide both an <code>EQUALS</code> filter and a
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filter. Combining filters in this way always returns an
     * error, even if the provided filter values would return valid results.
     * </p>
     * <p>
     * You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     * filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, then the
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     * </p>
     * <p>
     * For example, for the following filter, Security Hub first identifies findings that have resource types that start
     * with either <code>AwsIAM</code> or <code>AwsEc2</code>. It then excludes findings that have a resource type of
     * <code>AwsIamPolicy</code> and findings that have a resource type of <code>AwsEc2NetworkInterface</code>.
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
     * 
     * @param comparison
     *        The condition to apply to a string value when querying for findings. To search for values that contain the
     *        filter criteria value, use one of the following comparison operators:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To search for values that exactly match the filter value, use <code>EQUALS</code>.
     *        </p>
     *        <p>
     *        For example, the filter <code>ResourceType EQUALS AwsEc2SecurityGroup</code> only matches findings that
     *        have a resource type of <code>AwsEc2SecurityGroup</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that start with the filter value, use <code>PREFIX</code>.
     *        </p>
     *        <p>
     *        For example, the filter <code>ResourceType PREFIX AwsIam</code> matches findings that have a resource type
     *        that starts with <code>AwsIam</code>. Findings with a resource type of <code>AwsIamPolicy</code>,
     *        <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all match.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>EQUALS</code> and <code>PREFIX</code> filters on the same field are joined by <code>OR</code>. A
     *        finding matches if it matches any one of those filters.
     *        </p>
     *        <p>
     *        To search for values that do not contain the filter criteria value, use one of the following comparison
     *        operators:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To search for values that do not exactly match the filter value, use <code>NOT_EQUALS</code>.
     *        </p>
     *        <p>
     *        For example, the filter <code>ResourceType NOT_EQUALS AwsIamPolicy</code> matches findings that have a
     *        resource type other than <code>AwsIamPolicy</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that do not start with the filter value, use <code>PREFIX_NOT_EQUALS</code>.
     *        </p>
     *        <p>
     *        For example, the filter <code>ResourceType PREFIX_NOT_EQUALS AwsIam</code> matches findings that have a
     *        resource type that does not start with <code>AwsIam</code>. Findings with a resource type of
     *        <code>AwsIamPolicy</code>, <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all be excluded from
     *        the results.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>NOT_EQUALS</code> and <code>PREFIX_NOT_EQUALS</code> filters on the same field are joined by
     *        <code>AND</code>. A finding matches only if it matches all of those filters.
     *        </p>
     *        <p>
     *        For filters on the same field, you cannot provide both an <code>EQUALS</code> filter and a
     *        <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filter. Combining filters in this way always
     *        returns an error, even if the provided filter values would return valid results.
     *        </p>
     *        <p>
     *        You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     *        filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, then the
     *        <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     *        </p>
     *        <p>
     *        For example, for the following filter, Security Hub first identifies findings that have resource types
     *        that start with either <code>AwsIAM</code> or <code>AwsEc2</code>. It then excludes findings that have a
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
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StringFilterComparison
     */

    public StringFilter withComparison(String comparison) {
        setComparison(comparison);
        return this;
    }

    /**
     * <p>
     * The condition to apply to a string value when querying for findings. To search for values that contain the filter
     * criteria value, use one of the following comparison operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType EQUALS AwsEc2SecurityGroup</code> only matches findings that have a
     * resource type of <code>AwsEc2SecurityGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that start with the filter value, use <code>PREFIX</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType PREFIX AwsIam</code> matches findings that have a resource type that
     * starts with <code>AwsIam</code>. Findings with a resource type of <code>AwsIamPolicy</code>,
     * <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EQUALS</code> and <code>PREFIX</code> filters on the same field are joined by <code>OR</code>. A finding
     * matches if it matches any one of those filters.
     * </p>
     * <p>
     * To search for values that do not contain the filter criteria value, use one of the following comparison
     * operators:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search for values that do not exactly match the filter value, use <code>NOT_EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType NOT_EQUALS AwsIamPolicy</code> matches findings that have a resource
     * type other than <code>AwsIamPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search for values that do not start with the filter value, use <code>PREFIX_NOT_EQUALS</code>.
     * </p>
     * <p>
     * For example, the filter <code>ResourceType PREFIX_NOT_EQUALS AwsIam</code> matches findings that have a resource
     * type that does not start with <code>AwsIam</code>. Findings with a resource type of <code>AwsIamPolicy</code>,
     * <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all be excluded from the results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>NOT_EQUALS</code> and <code>PREFIX_NOT_EQUALS</code> filters on the same field are joined by
     * <code>AND</code>. A finding matches only if it matches all of those filters.
     * </p>
     * <p>
     * For filters on the same field, you cannot provide both an <code>EQUALS</code> filter and a
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filter. Combining filters in this way always returns an
     * error, even if the provided filter values would return valid results.
     * </p>
     * <p>
     * You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     * filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, then the
     * <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     * </p>
     * <p>
     * For example, for the following filter, Security Hub first identifies findings that have resource types that start
     * with either <code>AwsIAM</code> or <code>AwsEc2</code>. It then excludes findings that have a resource type of
     * <code>AwsIamPolicy</code> and findings that have a resource type of <code>AwsEc2NetworkInterface</code>.
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
     * 
     * @param comparison
     *        The condition to apply to a string value when querying for findings. To search for values that contain the
     *        filter criteria value, use one of the following comparison operators:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To search for values that exactly match the filter value, use <code>EQUALS</code>.
     *        </p>
     *        <p>
     *        For example, the filter <code>ResourceType EQUALS AwsEc2SecurityGroup</code> only matches findings that
     *        have a resource type of <code>AwsEc2SecurityGroup</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that start with the filter value, use <code>PREFIX</code>.
     *        </p>
     *        <p>
     *        For example, the filter <code>ResourceType PREFIX AwsIam</code> matches findings that have a resource type
     *        that starts with <code>AwsIam</code>. Findings with a resource type of <code>AwsIamPolicy</code>,
     *        <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all match.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>EQUALS</code> and <code>PREFIX</code> filters on the same field are joined by <code>OR</code>. A
     *        finding matches if it matches any one of those filters.
     *        </p>
     *        <p>
     *        To search for values that do not contain the filter criteria value, use one of the following comparison
     *        operators:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To search for values that do not exactly match the filter value, use <code>NOT_EQUALS</code>.
     *        </p>
     *        <p>
     *        For example, the filter <code>ResourceType NOT_EQUALS AwsIamPolicy</code> matches findings that have a
     *        resource type other than <code>AwsIamPolicy</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To search for values that do not start with the filter value, use <code>PREFIX_NOT_EQUALS</code>.
     *        </p>
     *        <p>
     *        For example, the filter <code>ResourceType PREFIX_NOT_EQUALS AwsIam</code> matches findings that have a
     *        resource type that does not start with <code>AwsIam</code>. Findings with a resource type of
     *        <code>AwsIamPolicy</code>, <code>AwsIamRole</code>, or <code>AwsIamUser</code> would all be excluded from
     *        the results.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>NOT_EQUALS</code> and <code>PREFIX_NOT_EQUALS</code> filters on the same field are joined by
     *        <code>AND</code>. A finding matches only if it matches all of those filters.
     *        </p>
     *        <p>
     *        For filters on the same field, you cannot provide both an <code>EQUALS</code> filter and a
     *        <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filter. Combining filters in this way always
     *        returns an error, even if the provided filter values would return valid results.
     *        </p>
     *        <p>
     *        You can combine <code>PREFIX</code> filters with <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code>
     *        filters for the same field. Security Hub first processes the <code>PREFIX</code> filters, then the
     *        <code>NOT_EQUALS</code> or <code>PREFIX_NOT_EQUALS</code> filters.
     *        </p>
     *        <p>
     *        For example, for the following filter, Security Hub first identifies findings that have resource types
     *        that start with either <code>AwsIAM</code> or <code>AwsEc2</code>. It then excludes findings that have a
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
