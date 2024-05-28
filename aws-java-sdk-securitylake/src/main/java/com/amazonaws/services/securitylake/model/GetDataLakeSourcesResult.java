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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDataLakeSources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataLakeSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about ARNs and
     * how to use them in policies, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/subscriber-management.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     */
    private String dataLakeArn;
    /**
     * <p>
     * The list of enabled accounts and enabled sources.
     * </p>
     */
    private java.util.List<DataLakeSource> dataLakeSources;
    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about ARNs and
     * how to use them in policies, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/subscriber-management.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param dataLakeArn
     *        The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about
     *        ARNs and how to use them in policies, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/subscriber-management.html">Amazon
     *        Security Lake User Guide</a>.
     */

    public void setDataLakeArn(String dataLakeArn) {
        this.dataLakeArn = dataLakeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about ARNs and
     * how to use them in policies, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/subscriber-management.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about
     *         ARNs and how to use them in policies, see the <a
     *         href="https://docs.aws.amazon.com/security-lake/latest/userguide/subscriber-management.html">Amazon
     *         Security Lake User Guide</a>.
     */

    public String getDataLakeArn() {
        return this.dataLakeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about ARNs and
     * how to use them in policies, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/subscriber-management.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param dataLakeArn
     *        The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about
     *        ARNs and how to use them in policies, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/subscriber-management.html">Amazon
     *        Security Lake User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataLakeSourcesResult withDataLakeArn(String dataLakeArn) {
        setDataLakeArn(dataLakeArn);
        return this;
    }

    /**
     * <p>
     * The list of enabled accounts and enabled sources.
     * </p>
     * 
     * @return The list of enabled accounts and enabled sources.
     */

    public java.util.List<DataLakeSource> getDataLakeSources() {
        return dataLakeSources;
    }

    /**
     * <p>
     * The list of enabled accounts and enabled sources.
     * </p>
     * 
     * @param dataLakeSources
     *        The list of enabled accounts and enabled sources.
     */

    public void setDataLakeSources(java.util.Collection<DataLakeSource> dataLakeSources) {
        if (dataLakeSources == null) {
            this.dataLakeSources = null;
            return;
        }

        this.dataLakeSources = new java.util.ArrayList<DataLakeSource>(dataLakeSources);
    }

    /**
     * <p>
     * The list of enabled accounts and enabled sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataLakeSources(java.util.Collection)} or {@link #withDataLakeSources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dataLakeSources
     *        The list of enabled accounts and enabled sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataLakeSourcesResult withDataLakeSources(DataLakeSource... dataLakeSources) {
        if (this.dataLakeSources == null) {
            setDataLakeSources(new java.util.ArrayList<DataLakeSource>(dataLakeSources.length));
        }
        for (DataLakeSource ele : dataLakeSources) {
            this.dataLakeSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of enabled accounts and enabled sources.
     * </p>
     * 
     * @param dataLakeSources
     *        The list of enabled accounts and enabled sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataLakeSourcesResult withDataLakeSources(java.util.Collection<DataLakeSource> dataLakeSources) {
        setDataLakeSources(dataLakeSources);
        return this;
    }

    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     * 
     * @param nextToken
     *        Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *        page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *        unchanged.</p>
     *        <p>
     *        Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     *        InvalidToken error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     * 
     * @return Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *         page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *         unchanged.</p>
     *         <p>
     *         Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     *         InvalidToken error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     * 
     * @param nextToken
     *        Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *        page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *        unchanged.</p>
     *        <p>
     *        Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     *        InvalidToken error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataLakeSourcesResult withNextToken(String nextToken) {
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
        if (getDataLakeArn() != null)
            sb.append("DataLakeArn: ").append(getDataLakeArn()).append(",");
        if (getDataLakeSources() != null)
            sb.append("DataLakeSources: ").append(getDataLakeSources()).append(",");
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

        if (obj instanceof GetDataLakeSourcesResult == false)
            return false;
        GetDataLakeSourcesResult other = (GetDataLakeSourcesResult) obj;
        if (other.getDataLakeArn() == null ^ this.getDataLakeArn() == null)
            return false;
        if (other.getDataLakeArn() != null && other.getDataLakeArn().equals(this.getDataLakeArn()) == false)
            return false;
        if (other.getDataLakeSources() == null ^ this.getDataLakeSources() == null)
            return false;
        if (other.getDataLakeSources() != null && other.getDataLakeSources().equals(this.getDataLakeSources()) == false)
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

        hashCode = prime * hashCode + ((getDataLakeArn() == null) ? 0 : getDataLakeArn().hashCode());
        hashCode = prime * hashCode + ((getDataLakeSources() == null) ? 0 : getDataLakeSources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDataLakeSourcesResult clone() {
        try {
            return (GetDataLakeSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
