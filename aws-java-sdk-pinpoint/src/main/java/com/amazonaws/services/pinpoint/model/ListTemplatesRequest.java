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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListTemplates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTemplatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The string that specifies which page of results to return in a paginated response. This parameter is currently
     * not supported for application, campaign, and journey metrics.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported for application, campaign, and journey metrics.
     * </p>
     */
    private String pageSize;
    /**
     * <p>
     * The substring to match in the names of the message templates to include in the results. If you specify this
     * value, Amazon Pinpoint returns only those templates whose names begin with the value that you specify.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The type of message template to include in the results. Valid values are: EMAIL, PUSH, SMS, and VOICE. To include
     * all types of templates in the results, don't include this parameter in your request.
     * </p>
     */
    private String templateType;

    /**
     * <p>
     * The string that specifies which page of results to return in a paginated response. This parameter is currently
     * not supported for application, campaign, and journey metrics.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies which page of results to return in a paginated response. This parameter is
     *        currently not supported for application, campaign, and journey metrics.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies which page of results to return in a paginated response. This parameter is currently
     * not supported for application, campaign, and journey metrics.
     * </p>
     * 
     * @return The string that specifies which page of results to return in a paginated response. This parameter is
     *         currently not supported for application, campaign, and journey metrics.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies which page of results to return in a paginated response. This parameter is currently
     * not supported for application, campaign, and journey metrics.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies which page of results to return in a paginated response. This parameter is
     *        currently not supported for application, campaign, and journey metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported for application, campaign, and journey metrics.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to include in each page of a paginated response. This parameter is currently
     *        not supported for application, campaign, and journey metrics.
     */

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported for application, campaign, and journey metrics.
     * </p>
     * 
     * @return The maximum number of items to include in each page of a paginated response. This parameter is currently
     *         not supported for application, campaign, and journey metrics.
     */

    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported for application, campaign, and journey metrics.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to include in each page of a paginated response. This parameter is currently
     *        not supported for application, campaign, and journey metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplatesRequest withPageSize(String pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The substring to match in the names of the message templates to include in the results. If you specify this
     * value, Amazon Pinpoint returns only those templates whose names begin with the value that you specify.
     * </p>
     * 
     * @param prefix
     *        The substring to match in the names of the message templates to include in the results. If you specify
     *        this value, Amazon Pinpoint returns only those templates whose names begin with the value that you
     *        specify.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The substring to match in the names of the message templates to include in the results. If you specify this
     * value, Amazon Pinpoint returns only those templates whose names begin with the value that you specify.
     * </p>
     * 
     * @return The substring to match in the names of the message templates to include in the results. If you specify
     *         this value, Amazon Pinpoint returns only those templates whose names begin with the value that you
     *         specify.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The substring to match in the names of the message templates to include in the results. If you specify this
     * value, Amazon Pinpoint returns only those templates whose names begin with the value that you specify.
     * </p>
     * 
     * @param prefix
     *        The substring to match in the names of the message templates to include in the results. If you specify
     *        this value, Amazon Pinpoint returns only those templates whose names begin with the value that you
     *        specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplatesRequest withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The type of message template to include in the results. Valid values are: EMAIL, PUSH, SMS, and VOICE. To include
     * all types of templates in the results, don't include this parameter in your request.
     * </p>
     * 
     * @param templateType
     *        The type of message template to include in the results. Valid values are: EMAIL, PUSH, SMS, and VOICE. To
     *        include all types of templates in the results, don't include this parameter in your request.
     */

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The type of message template to include in the results. Valid values are: EMAIL, PUSH, SMS, and VOICE. To include
     * all types of templates in the results, don't include this parameter in your request.
     * </p>
     * 
     * @return The type of message template to include in the results. Valid values are: EMAIL, PUSH, SMS, and VOICE. To
     *         include all types of templates in the results, don't include this parameter in your request.
     */

    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * <p>
     * The type of message template to include in the results. Valid values are: EMAIL, PUSH, SMS, and VOICE. To include
     * all types of templates in the results, don't include this parameter in your request.
     * </p>
     * 
     * @param templateType
     *        The type of message template to include in the results. Valid values are: EMAIL, PUSH, SMS, and VOICE. To
     *        include all types of templates in the results, don't include this parameter in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplatesRequest withTemplateType(String templateType) {
        setTemplateType(templateType);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getTemplateType() != null)
            sb.append("TemplateType: ").append(getTemplateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTemplatesRequest == false)
            return false;
        ListTemplatesRequest other = (ListTemplatesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        return hashCode;
    }

    @Override
    public ListTemplatesRequest clone() {
        return (ListTemplatesRequest) super.clone();
    }

}
