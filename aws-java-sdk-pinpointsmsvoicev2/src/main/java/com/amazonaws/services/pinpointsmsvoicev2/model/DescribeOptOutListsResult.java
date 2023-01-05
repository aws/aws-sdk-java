/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeOptOutLists"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOptOutListsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of OptOutListInformation objects that contain the details for the requested OptOutLists.
     * </p>
     */
    private java.util.List<OptOutListInformation> optOutLists;
    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of OptOutListInformation objects that contain the details for the requested OptOutLists.
     * </p>
     * 
     * @return An array of OptOutListInformation objects that contain the details for the requested OptOutLists.
     */

    public java.util.List<OptOutListInformation> getOptOutLists() {
        return optOutLists;
    }

    /**
     * <p>
     * An array of OptOutListInformation objects that contain the details for the requested OptOutLists.
     * </p>
     * 
     * @param optOutLists
     *        An array of OptOutListInformation objects that contain the details for the requested OptOutLists.
     */

    public void setOptOutLists(java.util.Collection<OptOutListInformation> optOutLists) {
        if (optOutLists == null) {
            this.optOutLists = null;
            return;
        }

        this.optOutLists = new java.util.ArrayList<OptOutListInformation>(optOutLists);
    }

    /**
     * <p>
     * An array of OptOutListInformation objects that contain the details for the requested OptOutLists.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptOutLists(java.util.Collection)} or {@link #withOptOutLists(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param optOutLists
     *        An array of OptOutListInformation objects that contain the details for the requested OptOutLists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptOutListsResult withOptOutLists(OptOutListInformation... optOutLists) {
        if (this.optOutLists == null) {
            setOptOutLists(new java.util.ArrayList<OptOutListInformation>(optOutLists.length));
        }
        for (OptOutListInformation ele : optOutLists) {
            this.optOutLists.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of OptOutListInformation objects that contain the details for the requested OptOutLists.
     * </p>
     * 
     * @param optOutLists
     *        An array of OptOutListInformation objects that contain the details for the requested OptOutLists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptOutListsResult withOptOutLists(java.util.Collection<OptOutListInformation> optOutLists) {
        setOptOutLists(optOutLists);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. If this field is empty then there are no more
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results. If this field is empty then there are no more
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. If this field is empty then there are no more
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptOutListsResult withNextToken(String nextToken) {
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
        if (getOptOutLists() != null)
            sb.append("OptOutLists: ").append(getOptOutLists()).append(",");
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

        if (obj instanceof DescribeOptOutListsResult == false)
            return false;
        DescribeOptOutListsResult other = (DescribeOptOutListsResult) obj;
        if (other.getOptOutLists() == null ^ this.getOptOutLists() == null)
            return false;
        if (other.getOptOutLists() != null && other.getOptOutLists().equals(this.getOptOutLists()) == false)
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

        hashCode = prime * hashCode + ((getOptOutLists() == null) ? 0 : getOptOutLists().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOptOutListsResult clone() {
        try {
            return (DescribeOptOutListsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
