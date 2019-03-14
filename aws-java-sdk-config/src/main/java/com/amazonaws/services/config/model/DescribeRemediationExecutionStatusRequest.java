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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationExecutionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRemediationExecutionStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of AWS Config rule names.
     * </p>
     */
    private String configRuleName;
    /**
     * <p>
     * A list of resource keys to be processed with the current request. Each element in the list consists of the
     * resource type and resource ID.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceKey> resourceKeys;
    /**
     * <p>
     * The maximum number of RemediationExecutionStatuses returned on each page. The default is maximum. If you specify
     * 0, AWS Config uses the default.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of AWS Config rule names.
     * </p>
     * 
     * @param configRuleName
     *        A list of AWS Config rule names.
     */

    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }

    /**
     * <p>
     * A list of AWS Config rule names.
     * </p>
     * 
     * @return A list of AWS Config rule names.
     */

    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * <p>
     * A list of AWS Config rule names.
     * </p>
     * 
     * @param configRuleName
     *        A list of AWS Config rule names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRemediationExecutionStatusRequest withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * <p>
     * A list of resource keys to be processed with the current request. Each element in the list consists of the
     * resource type and resource ID.
     * </p>
     * 
     * @return A list of resource keys to be processed with the current request. Each element in the list consists of
     *         the resource type and resource ID.
     */

    public java.util.List<ResourceKey> getResourceKeys() {
        if (resourceKeys == null) {
            resourceKeys = new com.amazonaws.internal.SdkInternalList<ResourceKey>();
        }
        return resourceKeys;
    }

    /**
     * <p>
     * A list of resource keys to be processed with the current request. Each element in the list consists of the
     * resource type and resource ID.
     * </p>
     * 
     * @param resourceKeys
     *        A list of resource keys to be processed with the current request. Each element in the list consists of the
     *        resource type and resource ID.
     */

    public void setResourceKeys(java.util.Collection<ResourceKey> resourceKeys) {
        if (resourceKeys == null) {
            this.resourceKeys = null;
            return;
        }

        this.resourceKeys = new com.amazonaws.internal.SdkInternalList<ResourceKey>(resourceKeys);
    }

    /**
     * <p>
     * A list of resource keys to be processed with the current request. Each element in the list consists of the
     * resource type and resource ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceKeys(java.util.Collection)} or {@link #withResourceKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceKeys
     *        A list of resource keys to be processed with the current request. Each element in the list consists of the
     *        resource type and resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRemediationExecutionStatusRequest withResourceKeys(ResourceKey... resourceKeys) {
        if (this.resourceKeys == null) {
            setResourceKeys(new com.amazonaws.internal.SdkInternalList<ResourceKey>(resourceKeys.length));
        }
        for (ResourceKey ele : resourceKeys) {
            this.resourceKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource keys to be processed with the current request. Each element in the list consists of the
     * resource type and resource ID.
     * </p>
     * 
     * @param resourceKeys
     *        A list of resource keys to be processed with the current request. Each element in the list consists of the
     *        resource type and resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRemediationExecutionStatusRequest withResourceKeys(java.util.Collection<ResourceKey> resourceKeys) {
        setResourceKeys(resourceKeys);
        return this;
    }

    /**
     * <p>
     * The maximum number of RemediationExecutionStatuses returned on each page. The default is maximum. If you specify
     * 0, AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of RemediationExecutionStatuses returned on each page. The default is maximum. If you
     *        specify 0, AWS Config uses the default.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of RemediationExecutionStatuses returned on each page. The default is maximum. If you specify
     * 0, AWS Config uses the default.
     * </p>
     * 
     * @return The maximum number of RemediationExecutionStatuses returned on each page. The default is maximum. If you
     *         specify 0, AWS Config uses the default.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of RemediationExecutionStatuses returned on each page. The default is maximum. If you specify
     * 0, AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of RemediationExecutionStatuses returned on each page. The default is maximum. If you
     *        specify 0, AWS Config uses the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRemediationExecutionStatusRequest withLimit(Integer limit) {
        setLimit(limit);
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

    public DescribeRemediationExecutionStatusRequest withNextToken(String nextToken) {
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
        if (getConfigRuleName() != null)
            sb.append("ConfigRuleName: ").append(getConfigRuleName()).append(",");
        if (getResourceKeys() != null)
            sb.append("ResourceKeys: ").append(getResourceKeys()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
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

        if (obj instanceof DescribeRemediationExecutionStatusRequest == false)
            return false;
        DescribeRemediationExecutionStatusRequest other = (DescribeRemediationExecutionStatusRequest) obj;
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getResourceKeys() == null ^ this.getResourceKeys() == null)
            return false;
        if (other.getResourceKeys() != null && other.getResourceKeys().equals(this.getResourceKeys()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
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

        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getResourceKeys() == null) ? 0 : getResourceKeys().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRemediationExecutionStatusRequest clone() {
        return (DescribeRemediationExecutionStatusRequest) super.clone();
    }

}
