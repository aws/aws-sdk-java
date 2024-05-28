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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListIndicators" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIndicatorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     */
    private String investigationId;
    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return a Validation
     * Exception error.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Lists the indicators of compromise.
     * </p>
     */
    private java.util.List<Indicator> indicators;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The Amazon Resource Name (ARN) of the behavior graph.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the behavior graph.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The Amazon Resource Name (ARN) of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndicatorsResult withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     * 
     * @param investigationId
     *        The investigation ID of the investigation report.
     */

    public void setInvestigationId(String investigationId) {
        this.investigationId = investigationId;
    }

    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     * 
     * @return The investigation ID of the investigation report.
     */

    public String getInvestigationId() {
        return this.investigationId;
    }

    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     * 
     * @param investigationId
     *        The investigation ID of the investigation report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndicatorsResult withInvestigationId(String investigationId) {
        setInvestigationId(investigationId);
        return this;
    }

    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return a Validation
     * Exception error.
     * </p>
     * 
     * @param nextToken
     *        Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *        page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *        unchanged.</p>
     *        <p>
     *        Each pagination token expires after 24 hours. Using an expired pagination token will return a Validation
     *        Exception error.
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
     * Each pagination token expires after 24 hours. Using an expired pagination token will return a Validation
     * Exception error.
     * </p>
     * 
     * @return Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *         page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *         unchanged.</p>
     *         <p>
     *         Each pagination token expires after 24 hours. Using an expired pagination token will return a Validation
     *         Exception error.
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
     * Each pagination token expires after 24 hours. Using an expired pagination token will return a Validation
     * Exception error.
     * </p>
     * 
     * @param nextToken
     *        Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *        page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *        unchanged.</p>
     *        <p>
     *        Each pagination token expires after 24 hours. Using an expired pagination token will return a Validation
     *        Exception error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndicatorsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Lists the indicators of compromise.
     * </p>
     * 
     * @return Lists the indicators of compromise.
     */

    public java.util.List<Indicator> getIndicators() {
        return indicators;
    }

    /**
     * <p>
     * Lists the indicators of compromise.
     * </p>
     * 
     * @param indicators
     *        Lists the indicators of compromise.
     */

    public void setIndicators(java.util.Collection<Indicator> indicators) {
        if (indicators == null) {
            this.indicators = null;
            return;
        }

        this.indicators = new java.util.ArrayList<Indicator>(indicators);
    }

    /**
     * <p>
     * Lists the indicators of compromise.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIndicators(java.util.Collection)} or {@link #withIndicators(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param indicators
     *        Lists the indicators of compromise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndicatorsResult withIndicators(Indicator... indicators) {
        if (this.indicators == null) {
            setIndicators(new java.util.ArrayList<Indicator>(indicators.length));
        }
        for (Indicator ele : indicators) {
            this.indicators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the indicators of compromise.
     * </p>
     * 
     * @param indicators
     *        Lists the indicators of compromise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndicatorsResult withIndicators(java.util.Collection<Indicator> indicators) {
        setIndicators(indicators);
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
        if (getGraphArn() != null)
            sb.append("GraphArn: ").append(getGraphArn()).append(",");
        if (getInvestigationId() != null)
            sb.append("InvestigationId: ").append(getInvestigationId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getIndicators() != null)
            sb.append("Indicators: ").append(getIndicators());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIndicatorsResult == false)
            return false;
        ListIndicatorsResult other = (ListIndicatorsResult) obj;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
            return false;
        if (other.getInvestigationId() == null ^ this.getInvestigationId() == null)
            return false;
        if (other.getInvestigationId() != null && other.getInvestigationId().equals(this.getInvestigationId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getIndicators() == null ^ this.getIndicators() == null)
            return false;
        if (other.getIndicators() != null && other.getIndicators().equals(this.getIndicators()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getInvestigationId() == null) ? 0 : getInvestigationId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getIndicators() == null) ? 0 : getIndicators().hashCode());
        return hashCode;
    }

    @Override
    public ListIndicatorsResult clone() {
        try {
            return (ListIndicatorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
