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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to list attributes. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The type of the target with which to list attributes.
     * </p>
     */
    private String targetType;
    /**
     * <p>
     * The name of the attribute with which to filter the results.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The value of the attribute with which to filter results. You must also specify an attribute name to use this
     * parameter.
     * </p>
     */
    private String attributeValue;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListAttributes</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of cluster results returned by <code>ListAttributes</code> in paginated output. When this
     * parameter is used, <code>ListAttributes</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListAttributes</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If this parameter is not used, then <code>ListAttributes</code> returns up to 100
     * results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to list attributes. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster to list attributes. If you do not specify
     *        a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to list attributes. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster to list attributes. If you do not
     *         specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to list attributes. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster to list attributes. If you do not specify
     *        a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttributesRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The type of the target with which to list attributes.
     * </p>
     * 
     * @param targetType
     *        The type of the target with which to list attributes.
     * @see TargetType
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The type of the target with which to list attributes.
     * </p>
     * 
     * @return The type of the target with which to list attributes.
     * @see TargetType
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The type of the target with which to list attributes.
     * </p>
     * 
     * @param targetType
     *        The type of the target with which to list attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public ListAttributesRequest withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The type of the target with which to list attributes.
     * </p>
     * 
     * @param targetType
     *        The type of the target with which to list attributes.
     * @see TargetType
     */

    public void setTargetType(TargetType targetType) {
        withTargetType(targetType);
    }

    /**
     * <p>
     * The type of the target with which to list attributes.
     * </p>
     * 
     * @param targetType
     *        The type of the target with which to list attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public ListAttributesRequest withTargetType(TargetType targetType) {
        this.targetType = targetType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the attribute with which to filter the results.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute with which to filter the results.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the attribute with which to filter the results.
     * </p>
     * 
     * @return The name of the attribute with which to filter the results.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the attribute with which to filter the results.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute with which to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttributesRequest withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The value of the attribute with which to filter results. You must also specify an attribute name to use this
     * parameter.
     * </p>
     * 
     * @param attributeValue
     *        The value of the attribute with which to filter results. You must also specify an attribute name to use
     *        this parameter.
     */

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The value of the attribute with which to filter results. You must also specify an attribute name to use this
     * parameter.
     * </p>
     * 
     * @return The value of the attribute with which to filter results. You must also specify an attribute name to use
     *         this parameter.
     */

    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * <p>
     * The value of the attribute with which to filter results. You must also specify an attribute name to use this
     * parameter.
     * </p>
     * 
     * @param attributeValue
     *        The value of the attribute with which to filter results. You must also specify an attribute name to use
     *        this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttributesRequest withAttributeValue(String attributeValue) {
        setAttributeValue(attributeValue);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListAttributes</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListAttributes</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListAttributes</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListAttributes</code> request
     *         where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListAttributes</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListAttributes</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttributesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by <code>ListAttributes</code> in paginated output. When this
     * parameter is used, <code>ListAttributes</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListAttributes</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If this parameter is not used, then <code>ListAttributes</code> returns up to 100
     * results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of cluster results returned by <code>ListAttributes</code> in paginated output. When
     *        this parameter is used, <code>ListAttributes</code> only returns <code>maxResults</code> results in a
     *        single page along with a <code>nextToken</code> response element. The remaining results of the initial
     *        request can be seen by sending another <code>ListAttributes</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     *        <code>ListAttributes</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by <code>ListAttributes</code> in paginated output. When this
     * parameter is used, <code>ListAttributes</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListAttributes</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If this parameter is not used, then <code>ListAttributes</code> returns up to 100
     * results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of cluster results returned by <code>ListAttributes</code> in paginated output. When
     *         this parameter is used, <code>ListAttributes</code> only returns <code>maxResults</code> results in a
     *         single page along with a <code>nextToken</code> response element. The remaining results of the initial
     *         request can be seen by sending another <code>ListAttributes</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     *         <code>ListAttributes</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by <code>ListAttributes</code> in paginated output. When this
     * parameter is used, <code>ListAttributes</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListAttributes</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If this parameter is not used, then <code>ListAttributes</code> returns up to 100
     * results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of cluster results returned by <code>ListAttributes</code> in paginated output. When
     *        this parameter is used, <code>ListAttributes</code> only returns <code>maxResults</code> results in a
     *        single page along with a <code>nextToken</code> response element. The remaining results of the initial
     *        request can be seen by sending another <code>ListAttributes</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     *        <code>ListAttributes</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttributesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType()).append(",");
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: ").append(getAttributeValue()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAttributesRequest == false)
            return false;
        ListAttributesRequest other = (ListAttributesRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAttributesRequest clone() {
        return (ListAttributesRequest) super.clone();
    }

}
