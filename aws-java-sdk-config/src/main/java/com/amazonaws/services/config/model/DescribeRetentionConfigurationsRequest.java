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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRetentionConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRetentionConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of names of retention configurations for which you want details. If you do not specify a name, AWS Config
     * returns details for all the retention configurations for that account.
     * </p>
     * <note>
     * <p>
     * Currently, AWS Config supports only one retention configuration per region in your account.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> retentionConfigurationNames;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of names of retention configurations for which you want details. If you do not specify a name, AWS Config
     * returns details for all the retention configurations for that account.
     * </p>
     * <note>
     * <p>
     * Currently, AWS Config supports only one retention configuration per region in your account.
     * </p>
     * </note>
     * 
     * @return A list of names of retention configurations for which you want details. If you do not specify a name, AWS
     *         Config returns details for all the retention configurations for that account.</p> <note>
     *         <p>
     *         Currently, AWS Config supports only one retention configuration per region in your account.
     *         </p>
     */

    public java.util.List<String> getRetentionConfigurationNames() {
        if (retentionConfigurationNames == null) {
            retentionConfigurationNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return retentionConfigurationNames;
    }

    /**
     * <p>
     * A list of names of retention configurations for which you want details. If you do not specify a name, AWS Config
     * returns details for all the retention configurations for that account.
     * </p>
     * <note>
     * <p>
     * Currently, AWS Config supports only one retention configuration per region in your account.
     * </p>
     * </note>
     * 
     * @param retentionConfigurationNames
     *        A list of names of retention configurations for which you want details. If you do not specify a name, AWS
     *        Config returns details for all the retention configurations for that account.</p> <note>
     *        <p>
     *        Currently, AWS Config supports only one retention configuration per region in your account.
     *        </p>
     */

    public void setRetentionConfigurationNames(java.util.Collection<String> retentionConfigurationNames) {
        if (retentionConfigurationNames == null) {
            this.retentionConfigurationNames = null;
            return;
        }

        this.retentionConfigurationNames = new com.amazonaws.internal.SdkInternalList<String>(retentionConfigurationNames);
    }

    /**
     * <p>
     * A list of names of retention configurations for which you want details. If you do not specify a name, AWS Config
     * returns details for all the retention configurations for that account.
     * </p>
     * <note>
     * <p>
     * Currently, AWS Config supports only one retention configuration per region in your account.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRetentionConfigurationNames(java.util.Collection)} or
     * {@link #withRetentionConfigurationNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param retentionConfigurationNames
     *        A list of names of retention configurations for which you want details. If you do not specify a name, AWS
     *        Config returns details for all the retention configurations for that account.</p> <note>
     *        <p>
     *        Currently, AWS Config supports only one retention configuration per region in your account.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRetentionConfigurationsRequest withRetentionConfigurationNames(String... retentionConfigurationNames) {
        if (this.retentionConfigurationNames == null) {
            setRetentionConfigurationNames(new com.amazonaws.internal.SdkInternalList<String>(retentionConfigurationNames.length));
        }
        for (String ele : retentionConfigurationNames) {
            this.retentionConfigurationNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of retention configurations for which you want details. If you do not specify a name, AWS Config
     * returns details for all the retention configurations for that account.
     * </p>
     * <note>
     * <p>
     * Currently, AWS Config supports only one retention configuration per region in your account.
     * </p>
     * </note>
     * 
     * @param retentionConfigurationNames
     *        A list of names of retention configurations for which you want details. If you do not specify a name, AWS
     *        Config returns details for all the retention configurations for that account.</p> <note>
     *        <p>
     *        Currently, AWS Config supports only one retention configuration per region in your account.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRetentionConfigurationsRequest withRetentionConfigurationNames(java.util.Collection<String> retentionConfigurationNames) {
        setRetentionConfigurationNames(retentionConfigurationNames);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page that you use to get the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRetentionConfigurationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getRetentionConfigurationNames() != null)
            sb.append("RetentionConfigurationNames: ").append(getRetentionConfigurationNames()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRetentionConfigurationsRequest == false)
            return false;
        DescribeRetentionConfigurationsRequest other = (DescribeRetentionConfigurationsRequest) obj;
        if (other.getRetentionConfigurationNames() == null ^ this.getRetentionConfigurationNames() == null)
            return false;
        if (other.getRetentionConfigurationNames() != null && other.getRetentionConfigurationNames().equals(this.getRetentionConfigurationNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetentionConfigurationNames() == null) ? 0 : getRetentionConfigurationNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRetentionConfigurationsRequest clone() {
        return (DescribeRetentionConfigurationsRequest) super.clone();
    }

}
