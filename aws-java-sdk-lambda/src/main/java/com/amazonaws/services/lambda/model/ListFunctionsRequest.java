/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#listFunctions(ListFunctionsRequest) ListFunctions operation}.
 * <p>
 * Returns a list of your Lambda functions. For each function, the
 * response includes the function configuration information. You must use
 * GetFunction to retrieve the code for your function.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:ListFunctions</code> action.
 * </p>
 * <p>
 * If you are using versioning feature, the response returns list of
 * $LATEST versions of your functions. For information about the
 * versioning feature, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#listFunctions(ListFunctionsRequest)
 */
public class ListFunctionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Optional string. An opaque pagination token returned from a previous
     * <code>ListFunctions</code> operation. If present, indicates where to
     * continue the listing.
     */
    private String marker;

    /**
     * Optional integer. Specifies the maximum number of AWS Lambda functions
     * to return in response. This parameter value must be greater than 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer maxItems;

    /**
     * Optional string. An opaque pagination token returned from a previous
     * <code>ListFunctions</code> operation. If present, indicates where to
     * continue the listing.
     *
     * @return Optional string. An opaque pagination token returned from a previous
     *         <code>ListFunctions</code> operation. If present, indicates where to
     *         continue the listing.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Optional string. An opaque pagination token returned from a previous
     * <code>ListFunctions</code> operation. If present, indicates where to
     * continue the listing.
     *
     * @param marker Optional string. An opaque pagination token returned from a previous
     *         <code>ListFunctions</code> operation. If present, indicates where to
     *         continue the listing.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Optional string. An opaque pagination token returned from a previous
     * <code>ListFunctions</code> operation. If present, indicates where to
     * continue the listing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker Optional string. An opaque pagination token returned from a previous
     *         <code>ListFunctions</code> operation. If present, indicates where to
     *         continue the listing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListFunctionsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Optional integer. Specifies the maximum number of AWS Lambda functions
     * to return in response. This parameter value must be greater than 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return Optional integer. Specifies the maximum number of AWS Lambda functions
     *         to return in response. This parameter value must be greater than 0.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Optional integer. Specifies the maximum number of AWS Lambda functions
     * to return in response. This parameter value must be greater than 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxItems Optional integer. Specifies the maximum number of AWS Lambda functions
     *         to return in response. This parameter value must be greater than 0.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Optional integer. Specifies the maximum number of AWS Lambda functions
     * to return in response. This parameter value must be greater than 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxItems Optional integer. Specifies the maximum number of AWS Lambda functions
     *         to return in response. This parameter value must be greater than 0.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListFunctionsRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListFunctionsRequest == false) return false;
        ListFunctionsRequest other = (ListFunctionsRequest)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListFunctionsRequest clone() {
        
            return (ListFunctionsRequest) super.clone();
    }

}
    