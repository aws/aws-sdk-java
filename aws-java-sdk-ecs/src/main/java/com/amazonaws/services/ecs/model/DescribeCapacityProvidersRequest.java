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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeCapacityProviders" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCapacityProvidersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of one or more capacity providers. Up to <code>100</code>
     * capacity providers can be described in an action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> capacityProviders;
    /**
     * <p>
     * Specifies whether or not you want to see the resource tags for the capacity provider. If <code>TAGS</code> is
     * specified, the tags are included in the response. If this field is omitted, tags are not included in the
     * response.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> include;
    /**
     * <p>
     * The maximum number of account setting results returned by <code>DescribeCapacityProviders</code> in paginated
     * output. When this parameter is used, <code>DescribeCapacityProviders</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeCapacityProviders</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 10. If this parameter is not used, then
     * <code>DescribeCapacityProviders</code> returns up to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeCapacityProviders</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value.
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
     * The short name or full Amazon Resource Name (ARN) of one or more capacity providers. Up to <code>100</code>
     * capacity providers can be described in an action.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of one or more capacity providers. Up to
     *         <code>100</code> capacity providers can be described in an action.
     */

    public java.util.List<String> getCapacityProviders() {
        if (capacityProviders == null) {
            capacityProviders = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return capacityProviders;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of one or more capacity providers. Up to <code>100</code>
     * capacity providers can be described in an action.
     * </p>
     * 
     * @param capacityProviders
     *        The short name or full Amazon Resource Name (ARN) of one or more capacity providers. Up to
     *        <code>100</code> capacity providers can be described in an action.
     */

    public void setCapacityProviders(java.util.Collection<String> capacityProviders) {
        if (capacityProviders == null) {
            this.capacityProviders = null;
            return;
        }

        this.capacityProviders = new com.amazonaws.internal.SdkInternalList<String>(capacityProviders);
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of one or more capacity providers. Up to <code>100</code>
     * capacity providers can be described in an action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityProviders(java.util.Collection)} or {@link #withCapacityProviders(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param capacityProviders
     *        The short name or full Amazon Resource Name (ARN) of one or more capacity providers. Up to
     *        <code>100</code> capacity providers can be described in an action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityProvidersRequest withCapacityProviders(String... capacityProviders) {
        if (this.capacityProviders == null) {
            setCapacityProviders(new com.amazonaws.internal.SdkInternalList<String>(capacityProviders.length));
        }
        for (String ele : capacityProviders) {
            this.capacityProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of one or more capacity providers. Up to <code>100</code>
     * capacity providers can be described in an action.
     * </p>
     * 
     * @param capacityProviders
     *        The short name or full Amazon Resource Name (ARN) of one or more capacity providers. Up to
     *        <code>100</code> capacity providers can be described in an action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityProvidersRequest withCapacityProviders(java.util.Collection<String> capacityProviders) {
        setCapacityProviders(capacityProviders);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not you want to see the resource tags for the capacity provider. If <code>TAGS</code> is
     * specified, the tags are included in the response. If this field is omitted, tags are not included in the
     * response.
     * </p>
     * 
     * @return Specifies whether or not you want to see the resource tags for the capacity provider. If
     *         <code>TAGS</code> is specified, the tags are included in the response. If this field is omitted, tags are
     *         not included in the response.
     * @see CapacityProviderField
     */

    public java.util.List<String> getInclude() {
        if (include == null) {
            include = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return include;
    }

    /**
     * <p>
     * Specifies whether or not you want to see the resource tags for the capacity provider. If <code>TAGS</code> is
     * specified, the tags are included in the response. If this field is omitted, tags are not included in the
     * response.
     * </p>
     * 
     * @param include
     *        Specifies whether or not you want to see the resource tags for the capacity provider. If <code>TAGS</code>
     *        is specified, the tags are included in the response. If this field is omitted, tags are not included in
     *        the response.
     * @see CapacityProviderField
     */

    public void setInclude(java.util.Collection<String> include) {
        if (include == null) {
            this.include = null;
            return;
        }

        this.include = new com.amazonaws.internal.SdkInternalList<String>(include);
    }

    /**
     * <p>
     * Specifies whether or not you want to see the resource tags for the capacity provider. If <code>TAGS</code> is
     * specified, the tags are included in the response. If this field is omitted, tags are not included in the
     * response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclude(java.util.Collection)} or {@link #withInclude(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param include
     *        Specifies whether or not you want to see the resource tags for the capacity provider. If <code>TAGS</code>
     *        is specified, the tags are included in the response. If this field is omitted, tags are not included in
     *        the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityProviderField
     */

    public DescribeCapacityProvidersRequest withInclude(String... include) {
        if (this.include == null) {
            setInclude(new com.amazonaws.internal.SdkInternalList<String>(include.length));
        }
        for (String ele : include) {
            this.include.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether or not you want to see the resource tags for the capacity provider. If <code>TAGS</code> is
     * specified, the tags are included in the response. If this field is omitted, tags are not included in the
     * response.
     * </p>
     * 
     * @param include
     *        Specifies whether or not you want to see the resource tags for the capacity provider. If <code>TAGS</code>
     *        is specified, the tags are included in the response. If this field is omitted, tags are not included in
     *        the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityProviderField
     */

    public DescribeCapacityProvidersRequest withInclude(java.util.Collection<String> include) {
        setInclude(include);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not you want to see the resource tags for the capacity provider. If <code>TAGS</code> is
     * specified, the tags are included in the response. If this field is omitted, tags are not included in the
     * response.
     * </p>
     * 
     * @param include
     *        Specifies whether or not you want to see the resource tags for the capacity provider. If <code>TAGS</code>
     *        is specified, the tags are included in the response. If this field is omitted, tags are not included in
     *        the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityProviderField
     */

    public DescribeCapacityProvidersRequest withInclude(CapacityProviderField... include) {
        com.amazonaws.internal.SdkInternalList<String> includeCopy = new com.amazonaws.internal.SdkInternalList<String>(include.length);
        for (CapacityProviderField value : include) {
            includeCopy.add(value.toString());
        }
        if (getInclude() == null) {
            setInclude(includeCopy);
        } else {
            getInclude().addAll(includeCopy);
        }
        return this;
    }

    /**
     * <p>
     * The maximum number of account setting results returned by <code>DescribeCapacityProviders</code> in paginated
     * output. When this parameter is used, <code>DescribeCapacityProviders</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeCapacityProviders</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 10. If this parameter is not used, then
     * <code>DescribeCapacityProviders</code> returns up to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of account setting results returned by <code>DescribeCapacityProviders</code> in
     *        paginated output. When this parameter is used, <code>DescribeCapacityProviders</code> only returns
     *        <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>DescribeCapacityProviders</code> request with the returned <code>nextToken</code> value. This value
     *        can be between 1 and 10. If this parameter is not used, then <code>DescribeCapacityProviders</code>
     *        returns up to 10 results and a <code>nextToken</code> value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of account setting results returned by <code>DescribeCapacityProviders</code> in paginated
     * output. When this parameter is used, <code>DescribeCapacityProviders</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeCapacityProviders</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 10. If this parameter is not used, then
     * <code>DescribeCapacityProviders</code> returns up to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of account setting results returned by <code>DescribeCapacityProviders</code> in
     *         paginated output. When this parameter is used, <code>DescribeCapacityProviders</code> only returns
     *         <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending another
     *         <code>DescribeCapacityProviders</code> request with the returned <code>nextToken</code> value. This value
     *         can be between 1 and 10. If this parameter is not used, then <code>DescribeCapacityProviders</code>
     *         returns up to 10 results and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of account setting results returned by <code>DescribeCapacityProviders</code> in paginated
     * output. When this parameter is used, <code>DescribeCapacityProviders</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeCapacityProviders</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 10. If this parameter is not used, then
     * <code>DescribeCapacityProviders</code> returns up to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of account setting results returned by <code>DescribeCapacityProviders</code> in
     *        paginated output. When this parameter is used, <code>DescribeCapacityProviders</code> only returns
     *        <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>DescribeCapacityProviders</code> request with the returned <code>nextToken</code> value. This value
     *        can be between 1 and 10. If this parameter is not used, then <code>DescribeCapacityProviders</code>
     *        returns up to 10 results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityProvidersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeCapacityProviders</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>DescribeCapacityProviders</code>
     *        request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>nextToken</code>
     *        value.</p> <note>
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
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeCapacityProviders</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated
     *         <code>DescribeCapacityProviders</code> request where <code>maxResults</code> was used and the results
     *         exceeded the value of that parameter. Pagination continues from the end of the previous results that
     *         returned the <code>nextToken</code> value.</p> <note>
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
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeCapacityProviders</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>DescribeCapacityProviders</code>
     *        request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>nextToken</code>
     *        value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityProvidersRequest withNextToken(String nextToken) {
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
        if (getCapacityProviders() != null)
            sb.append("CapacityProviders: ").append(getCapacityProviders()).append(",");
        if (getInclude() != null)
            sb.append("Include: ").append(getInclude()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribeCapacityProvidersRequest == false)
            return false;
        DescribeCapacityProvidersRequest other = (DescribeCapacityProvidersRequest) obj;
        if (other.getCapacityProviders() == null ^ this.getCapacityProviders() == null)
            return false;
        if (other.getCapacityProviders() != null && other.getCapacityProviders().equals(this.getCapacityProviders()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getCapacityProviders() == null) ? 0 : getCapacityProviders().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCapacityProvidersRequest clone() {
        return (DescribeCapacityProvidersRequest) super.clone();
    }

}
