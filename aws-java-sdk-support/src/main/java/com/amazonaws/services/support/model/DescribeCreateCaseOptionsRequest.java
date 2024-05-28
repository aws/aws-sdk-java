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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeCreateCaseOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCreateCaseOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of issue for the case. You can specify <code>customer-service</code> or <code>technical</code>. If you
     * don't specify a value, the default is <code>technical</code>.
     * </p>
     */
    private String issueType;
    /**
     * <p>
     * The code for the Amazon Web Services service. You can use the <a>DescribeServices</a> operation to get the
     * possible <code>serviceCode</code> values.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The language in which Amazon Web Services Support handles the case. Amazon Web Services Support currently
     * supports Chinese (“zh”), English ("en"), Japanese ("ja") and Korean (“ko”). You must specify the ISO 639-1 code
     * for the <code>language</code> parameter if you want support in that language.
     * </p>
     */
    private String language;
    /**
     * <p>
     * The category of problem for the support case. You also use the <a>DescribeServices</a> operation to get the
     * category code for a service. Each Amazon Web Services service defines its own set of category codes.
     * </p>
     */
    private String categoryCode;

    /**
     * <p>
     * The type of issue for the case. You can specify <code>customer-service</code> or <code>technical</code>. If you
     * don't specify a value, the default is <code>technical</code>.
     * </p>
     * 
     * @param issueType
     *        The type of issue for the case. You can specify <code>customer-service</code> or <code>technical</code>.
     *        If you don't specify a value, the default is <code>technical</code>.
     */

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    /**
     * <p>
     * The type of issue for the case. You can specify <code>customer-service</code> or <code>technical</code>. If you
     * don't specify a value, the default is <code>technical</code>.
     * </p>
     * 
     * @return The type of issue for the case. You can specify <code>customer-service</code> or <code>technical</code>.
     *         If you don't specify a value, the default is <code>technical</code>.
     */

    public String getIssueType() {
        return this.issueType;
    }

    /**
     * <p>
     * The type of issue for the case. You can specify <code>customer-service</code> or <code>technical</code>. If you
     * don't specify a value, the default is <code>technical</code>.
     * </p>
     * 
     * @param issueType
     *        The type of issue for the case. You can specify <code>customer-service</code> or <code>technical</code>.
     *        If you don't specify a value, the default is <code>technical</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCreateCaseOptionsRequest withIssueType(String issueType) {
        setIssueType(issueType);
        return this;
    }

    /**
     * <p>
     * The code for the Amazon Web Services service. You can use the <a>DescribeServices</a> operation to get the
     * possible <code>serviceCode</code> values.
     * </p>
     * 
     * @param serviceCode
     *        The code for the Amazon Web Services service. You can use the <a>DescribeServices</a> operation to get the
     *        possible <code>serviceCode</code> values.
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The code for the Amazon Web Services service. You can use the <a>DescribeServices</a> operation to get the
     * possible <code>serviceCode</code> values.
     * </p>
     * 
     * @return The code for the Amazon Web Services service. You can use the <a>DescribeServices</a> operation to get
     *         the possible <code>serviceCode</code> values.
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The code for the Amazon Web Services service. You can use the <a>DescribeServices</a> operation to get the
     * possible <code>serviceCode</code> values.
     * </p>
     * 
     * @param serviceCode
     *        The code for the Amazon Web Services service. You can use the <a>DescribeServices</a> operation to get the
     *        possible <code>serviceCode</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCreateCaseOptionsRequest withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The language in which Amazon Web Services Support handles the case. Amazon Web Services Support currently
     * supports Chinese (“zh”), English ("en"), Japanese ("ja") and Korean (“ko”). You must specify the ISO 639-1 code
     * for the <code>language</code> parameter if you want support in that language.
     * </p>
     * 
     * @param language
     *        The language in which Amazon Web Services Support handles the case. Amazon Web Services Support currently
     *        supports Chinese (“zh”), English ("en"), Japanese ("ja") and Korean (“ko”). You must specify the ISO 639-1
     *        code for the <code>language</code> parameter if you want support in that language.
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The language in which Amazon Web Services Support handles the case. Amazon Web Services Support currently
     * supports Chinese (“zh”), English ("en"), Japanese ("ja") and Korean (“ko”). You must specify the ISO 639-1 code
     * for the <code>language</code> parameter if you want support in that language.
     * </p>
     * 
     * @return The language in which Amazon Web Services Support handles the case. Amazon Web Services Support currently
     *         supports Chinese (“zh”), English ("en"), Japanese ("ja") and Korean (“ko”). You must specify the ISO
     *         639-1 code for the <code>language</code> parameter if you want support in that language.
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The language in which Amazon Web Services Support handles the case. Amazon Web Services Support currently
     * supports Chinese (“zh”), English ("en"), Japanese ("ja") and Korean (“ko”). You must specify the ISO 639-1 code
     * for the <code>language</code> parameter if you want support in that language.
     * </p>
     * 
     * @param language
     *        The language in which Amazon Web Services Support handles the case. Amazon Web Services Support currently
     *        supports Chinese (“zh”), English ("en"), Japanese ("ja") and Korean (“ko”). You must specify the ISO 639-1
     *        code for the <code>language</code> parameter if you want support in that language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCreateCaseOptionsRequest withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * The category of problem for the support case. You also use the <a>DescribeServices</a> operation to get the
     * category code for a service. Each Amazon Web Services service defines its own set of category codes.
     * </p>
     * 
     * @param categoryCode
     *        The category of problem for the support case. You also use the <a>DescribeServices</a> operation to get
     *        the category code for a service. Each Amazon Web Services service defines its own set of category codes.
     */

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * <p>
     * The category of problem for the support case. You also use the <a>DescribeServices</a> operation to get the
     * category code for a service. Each Amazon Web Services service defines its own set of category codes.
     * </p>
     * 
     * @return The category of problem for the support case. You also use the <a>DescribeServices</a> operation to get
     *         the category code for a service. Each Amazon Web Services service defines its own set of category codes.
     */

    public String getCategoryCode() {
        return this.categoryCode;
    }

    /**
     * <p>
     * The category of problem for the support case. You also use the <a>DescribeServices</a> operation to get the
     * category code for a service. Each Amazon Web Services service defines its own set of category codes.
     * </p>
     * 
     * @param categoryCode
     *        The category of problem for the support case. You also use the <a>DescribeServices</a> operation to get
     *        the category code for a service. Each Amazon Web Services service defines its own set of category codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCreateCaseOptionsRequest withCategoryCode(String categoryCode) {
        setCategoryCode(categoryCode);
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
        if (getIssueType() != null)
            sb.append("IssueType: ").append(getIssueType()).append(",");
        if (getServiceCode() != null)
            sb.append("ServiceCode: ").append(getServiceCode()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getCategoryCode() != null)
            sb.append("CategoryCode: ").append(getCategoryCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCreateCaseOptionsRequest == false)
            return false;
        DescribeCreateCaseOptionsRequest other = (DescribeCreateCaseOptionsRequest) obj;
        if (other.getIssueType() == null ^ this.getIssueType() == null)
            return false;
        if (other.getIssueType() != null && other.getIssueType().equals(this.getIssueType()) == false)
            return false;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getCategoryCode() == null ^ this.getCategoryCode() == null)
            return false;
        if (other.getCategoryCode() != null && other.getCategoryCode().equals(this.getCategoryCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIssueType() == null) ? 0 : getIssueType().hashCode());
        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getCategoryCode() == null) ? 0 : getCategoryCode().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCreateCaseOptionsRequest clone() {
        return (DescribeCreateCaseOptionsRequest) super.clone();
    }

}
