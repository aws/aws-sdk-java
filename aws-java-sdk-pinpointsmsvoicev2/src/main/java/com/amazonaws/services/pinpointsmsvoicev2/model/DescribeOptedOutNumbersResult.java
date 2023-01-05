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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeOptedOutNumbers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOptedOutNumbersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OptOutList.
     * </p>
     */
    private String optOutListArn;
    /**
     * <p>
     * The name of the OptOutList.
     * </p>
     */
    private String optOutListName;
    /**
     * <p>
     * An array of OptedOutNumbersInformation objects that provide information about the requested OptedOutNumbers.
     * </p>
     */
    private java.util.List<OptedOutNumberInformation> optedOutNumbers;
    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OptOutList.
     * </p>
     * 
     * @param optOutListArn
     *        The Amazon Resource Name (ARN) of the OptOutList.
     */

    public void setOptOutListArn(String optOutListArn) {
        this.optOutListArn = optOutListArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OptOutList.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the OptOutList.
     */

    public String getOptOutListArn() {
        return this.optOutListArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OptOutList.
     * </p>
     * 
     * @param optOutListArn
     *        The Amazon Resource Name (ARN) of the OptOutList.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptedOutNumbersResult withOptOutListArn(String optOutListArn) {
        setOptOutListArn(optOutListArn);
        return this;
    }

    /**
     * <p>
     * The name of the OptOutList.
     * </p>
     * 
     * @param optOutListName
     *        The name of the OptOutList.
     */

    public void setOptOutListName(String optOutListName) {
        this.optOutListName = optOutListName;
    }

    /**
     * <p>
     * The name of the OptOutList.
     * </p>
     * 
     * @return The name of the OptOutList.
     */

    public String getOptOutListName() {
        return this.optOutListName;
    }

    /**
     * <p>
     * The name of the OptOutList.
     * </p>
     * 
     * @param optOutListName
     *        The name of the OptOutList.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptedOutNumbersResult withOptOutListName(String optOutListName) {
        setOptOutListName(optOutListName);
        return this;
    }

    /**
     * <p>
     * An array of OptedOutNumbersInformation objects that provide information about the requested OptedOutNumbers.
     * </p>
     * 
     * @return An array of OptedOutNumbersInformation objects that provide information about the requested
     *         OptedOutNumbers.
     */

    public java.util.List<OptedOutNumberInformation> getOptedOutNumbers() {
        return optedOutNumbers;
    }

    /**
     * <p>
     * An array of OptedOutNumbersInformation objects that provide information about the requested OptedOutNumbers.
     * </p>
     * 
     * @param optedOutNumbers
     *        An array of OptedOutNumbersInformation objects that provide information about the requested
     *        OptedOutNumbers.
     */

    public void setOptedOutNumbers(java.util.Collection<OptedOutNumberInformation> optedOutNumbers) {
        if (optedOutNumbers == null) {
            this.optedOutNumbers = null;
            return;
        }

        this.optedOutNumbers = new java.util.ArrayList<OptedOutNumberInformation>(optedOutNumbers);
    }

    /**
     * <p>
     * An array of OptedOutNumbersInformation objects that provide information about the requested OptedOutNumbers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptedOutNumbers(java.util.Collection)} or {@link #withOptedOutNumbers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param optedOutNumbers
     *        An array of OptedOutNumbersInformation objects that provide information about the requested
     *        OptedOutNumbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptedOutNumbersResult withOptedOutNumbers(OptedOutNumberInformation... optedOutNumbers) {
        if (this.optedOutNumbers == null) {
            setOptedOutNumbers(new java.util.ArrayList<OptedOutNumberInformation>(optedOutNumbers.length));
        }
        for (OptedOutNumberInformation ele : optedOutNumbers) {
            this.optedOutNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of OptedOutNumbersInformation objects that provide information about the requested OptedOutNumbers.
     * </p>
     * 
     * @param optedOutNumbers
     *        An array of OptedOutNumbersInformation objects that provide information about the requested
     *        OptedOutNumbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptedOutNumbersResult withOptedOutNumbers(java.util.Collection<OptedOutNumberInformation> optedOutNumbers) {
        setOptedOutNumbers(optedOutNumbers);
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

    public DescribeOptedOutNumbersResult withNextToken(String nextToken) {
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
        if (getOptOutListArn() != null)
            sb.append("OptOutListArn: ").append(getOptOutListArn()).append(",");
        if (getOptOutListName() != null)
            sb.append("OptOutListName: ").append(getOptOutListName()).append(",");
        if (getOptedOutNumbers() != null)
            sb.append("OptedOutNumbers: ").append(getOptedOutNumbers()).append(",");
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

        if (obj instanceof DescribeOptedOutNumbersResult == false)
            return false;
        DescribeOptedOutNumbersResult other = (DescribeOptedOutNumbersResult) obj;
        if (other.getOptOutListArn() == null ^ this.getOptOutListArn() == null)
            return false;
        if (other.getOptOutListArn() != null && other.getOptOutListArn().equals(this.getOptOutListArn()) == false)
            return false;
        if (other.getOptOutListName() == null ^ this.getOptOutListName() == null)
            return false;
        if (other.getOptOutListName() != null && other.getOptOutListName().equals(this.getOptOutListName()) == false)
            return false;
        if (other.getOptedOutNumbers() == null ^ this.getOptedOutNumbers() == null)
            return false;
        if (other.getOptedOutNumbers() != null && other.getOptedOutNumbers().equals(this.getOptedOutNumbers()) == false)
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

        hashCode = prime * hashCode + ((getOptOutListArn() == null) ? 0 : getOptOutListArn().hashCode());
        hashCode = prime * hashCode + ((getOptOutListName() == null) ? 0 : getOptOutListName().hashCode());
        hashCode = prime * hashCode + ((getOptedOutNumbers() == null) ? 0 : getOptedOutNumbers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOptedOutNumbersResult clone() {
        try {
            return (DescribeOptedOutNumbersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
