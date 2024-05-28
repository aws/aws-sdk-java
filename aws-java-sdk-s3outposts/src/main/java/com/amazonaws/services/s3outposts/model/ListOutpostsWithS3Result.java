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
package com.amazonaws.services.s3outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/ListOutpostsWithS3" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOutpostsWithS3Result extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the list of Outposts that have the following characteristics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * outposts that have S3 provisioned
     * </p>
     * </li>
     * <li>
     * <p>
     * outposts that are <code>Active</code> (not pending any provisioning nor decommissioned)
     * </p>
     * </li>
     * <li>
     * <p>
     * outposts to which the the calling Amazon Web Services account has access
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Outpost> outposts;
    /**
     * <p>
     * Returns a token that you can use to call <code>ListOutpostsWithS3</code> again and receive additional results, if
     * there are any.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns the list of Outposts that have the following characteristics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * outposts that have S3 provisioned
     * </p>
     * </li>
     * <li>
     * <p>
     * outposts that are <code>Active</code> (not pending any provisioning nor decommissioned)
     * </p>
     * </li>
     * <li>
     * <p>
     * outposts to which the the calling Amazon Web Services account has access
     * </p>
     * </li>
     * </ul>
     * 
     * @return Returns the list of Outposts that have the following characteristics:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         outposts that have S3 provisioned
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         outposts that are <code>Active</code> (not pending any provisioning nor decommissioned)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         outposts to which the the calling Amazon Web Services account has access
     *         </p>
     *         </li>
     */

    public java.util.List<Outpost> getOutposts() {
        return outposts;
    }

    /**
     * <p>
     * Returns the list of Outposts that have the following characteristics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * outposts that have S3 provisioned
     * </p>
     * </li>
     * <li>
     * <p>
     * outposts that are <code>Active</code> (not pending any provisioning nor decommissioned)
     * </p>
     * </li>
     * <li>
     * <p>
     * outposts to which the the calling Amazon Web Services account has access
     * </p>
     * </li>
     * </ul>
     * 
     * @param outposts
     *        Returns the list of Outposts that have the following characteristics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        outposts that have S3 provisioned
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        outposts that are <code>Active</code> (not pending any provisioning nor decommissioned)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        outposts to which the the calling Amazon Web Services account has access
     *        </p>
     *        </li>
     */

    public void setOutposts(java.util.Collection<Outpost> outposts) {
        if (outposts == null) {
            this.outposts = null;
            return;
        }

        this.outposts = new java.util.ArrayList<Outpost>(outposts);
    }

    /**
     * <p>
     * Returns the list of Outposts that have the following characteristics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * outposts that have S3 provisioned
     * </p>
     * </li>
     * <li>
     * <p>
     * outposts that are <code>Active</code> (not pending any provisioning nor decommissioned)
     * </p>
     * </li>
     * <li>
     * <p>
     * outposts to which the the calling Amazon Web Services account has access
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutposts(java.util.Collection)} or {@link #withOutposts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outposts
     *        Returns the list of Outposts that have the following characteristics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        outposts that have S3 provisioned
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        outposts that are <code>Active</code> (not pending any provisioning nor decommissioned)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        outposts to which the the calling Amazon Web Services account has access
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostsWithS3Result withOutposts(Outpost... outposts) {
        if (this.outposts == null) {
            setOutposts(new java.util.ArrayList<Outpost>(outposts.length));
        }
        for (Outpost ele : outposts) {
            this.outposts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the list of Outposts that have the following characteristics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * outposts that have S3 provisioned
     * </p>
     * </li>
     * <li>
     * <p>
     * outposts that are <code>Active</code> (not pending any provisioning nor decommissioned)
     * </p>
     * </li>
     * <li>
     * <p>
     * outposts to which the the calling Amazon Web Services account has access
     * </p>
     * </li>
     * </ul>
     * 
     * @param outposts
     *        Returns the list of Outposts that have the following characteristics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        outposts that have S3 provisioned
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        outposts that are <code>Active</code> (not pending any provisioning nor decommissioned)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        outposts to which the the calling Amazon Web Services account has access
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostsWithS3Result withOutposts(java.util.Collection<Outpost> outposts) {
        setOutposts(outposts);
        return this;
    }

    /**
     * <p>
     * Returns a token that you can use to call <code>ListOutpostsWithS3</code> again and receive additional results, if
     * there are any.
     * </p>
     * 
     * @param nextToken
     *        Returns a token that you can use to call <code>ListOutpostsWithS3</code> again and receive additional
     *        results, if there are any.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Returns a token that you can use to call <code>ListOutpostsWithS3</code> again and receive additional results, if
     * there are any.
     * </p>
     * 
     * @return Returns a token that you can use to call <code>ListOutpostsWithS3</code> again and receive additional
     *         results, if there are any.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Returns a token that you can use to call <code>ListOutpostsWithS3</code> again and receive additional results, if
     * there are any.
     * </p>
     * 
     * @param nextToken
     *        Returns a token that you can use to call <code>ListOutpostsWithS3</code> again and receive additional
     *        results, if there are any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostsWithS3Result withNextToken(String nextToken) {
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
        if (getOutposts() != null)
            sb.append("Outposts: ").append(getOutposts()).append(",");
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

        if (obj instanceof ListOutpostsWithS3Result == false)
            return false;
        ListOutpostsWithS3Result other = (ListOutpostsWithS3Result) obj;
        if (other.getOutposts() == null ^ this.getOutposts() == null)
            return false;
        if (other.getOutposts() != null && other.getOutposts().equals(this.getOutposts()) == false)
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

        hashCode = prime * hashCode + ((getOutposts() == null) ? 0 : getOutposts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOutpostsWithS3Result clone() {
        try {
            return (ListOutpostsWithS3Result) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
