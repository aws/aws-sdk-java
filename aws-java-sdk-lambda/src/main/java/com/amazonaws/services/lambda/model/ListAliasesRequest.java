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
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#listAliases(ListAliasesRequest) ListAliases operation}.
 * <p>
 * Returns list of aliases created for a Lambda function. For each alias,
 * the response includes information such as the alias ARN, description,
 * alias name, and the function version to which it points. For more
 * information, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
 * .
 * </p>
 * <p>
 * This requires permission for the lambda:ListAliases action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#listAliases(ListAliasesRequest)
 */
public class ListAliasesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Lambda function name for which the alias is created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String functionName;

    /**
     * If you specify this optional parameter, the API returns only the
     * aliases that are pointing to the specific Lambda function version,
     * otherwise the API returns all of the aliases created for the Lambda
     * function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     */
    private String functionVersion;

    /**
     * Optional string. An opaque pagination token returned from a previous
     * <code>ListAliases</code> operation. If present, indicates where to
     * continue the listing.
     */
    private String marker;

    /**
     * Optional integer. Specifies the maximum number of aliases to return in
     * response. This parameter value must be greater than 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer maxItems;

    /**
     * Lambda function name for which the alias is created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return Lambda function name for which the alias is created.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * Lambda function name for which the alias is created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName Lambda function name for which the alias is created.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * Lambda function name for which the alias is created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName Lambda function name for which the alias is created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAliasesRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * If you specify this optional parameter, the API returns only the
     * aliases that are pointing to the specific Lambda function version,
     * otherwise the API returns all of the aliases created for the Lambda
     * function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @return If you specify this optional parameter, the API returns only the
     *         aliases that are pointing to the specific Lambda function version,
     *         otherwise the API returns all of the aliases created for the Lambda
     *         function.
     */
    public String getFunctionVersion() {
        return functionVersion;
    }
    
    /**
     * If you specify this optional parameter, the API returns only the
     * aliases that are pointing to the specific Lambda function version,
     * otherwise the API returns all of the aliases created for the Lambda
     * function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @param functionVersion If you specify this optional parameter, the API returns only the
     *         aliases that are pointing to the specific Lambda function version,
     *         otherwise the API returns all of the aliases created for the Lambda
     *         function.
     */
    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }
    
    /**
     * If you specify this optional parameter, the API returns only the
     * aliases that are pointing to the specific Lambda function version,
     * otherwise the API returns all of the aliases created for the Lambda
     * function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @param functionVersion If you specify this optional parameter, the API returns only the
     *         aliases that are pointing to the specific Lambda function version,
     *         otherwise the API returns all of the aliases created for the Lambda
     *         function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAliasesRequest withFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
        return this;
    }

    /**
     * Optional string. An opaque pagination token returned from a previous
     * <code>ListAliases</code> operation. If present, indicates where to
     * continue the listing.
     *
     * @return Optional string. An opaque pagination token returned from a previous
     *         <code>ListAliases</code> operation. If present, indicates where to
     *         continue the listing.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Optional string. An opaque pagination token returned from a previous
     * <code>ListAliases</code> operation. If present, indicates where to
     * continue the listing.
     *
     * @param marker Optional string. An opaque pagination token returned from a previous
     *         <code>ListAliases</code> operation. If present, indicates where to
     *         continue the listing.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Optional string. An opaque pagination token returned from a previous
     * <code>ListAliases</code> operation. If present, indicates where to
     * continue the listing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker Optional string. An opaque pagination token returned from a previous
     *         <code>ListAliases</code> operation. If present, indicates where to
     *         continue the listing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAliasesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Optional integer. Specifies the maximum number of aliases to return in
     * response. This parameter value must be greater than 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return Optional integer. Specifies the maximum number of aliases to return in
     *         response. This parameter value must be greater than 0.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Optional integer. Specifies the maximum number of aliases to return in
     * response. This parameter value must be greater than 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxItems Optional integer. Specifies the maximum number of aliases to return in
     *         response. This parameter value must be greater than 0.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Optional integer. Specifies the maximum number of aliases to return in
     * response. This parameter value must be greater than 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxItems Optional integer. Specifies the maximum number of aliases to return in
     *         response. This parameter value must be greater than 0.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAliasesRequest withMaxItems(Integer maxItems) {
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
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() + ",");
        if (getFunctionVersion() != null) sb.append("FunctionVersion: " + getFunctionVersion() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        hashCode = prime * hashCode + ((getFunctionVersion() == null) ? 0 : getFunctionVersion().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListAliasesRequest == false) return false;
        ListAliasesRequest other = (ListAliasesRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getFunctionVersion() == null ^ this.getFunctionVersion() == null) return false;
        if (other.getFunctionVersion() != null && other.getFunctionVersion().equals(this.getFunctionVersion()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListAliasesRequest clone() {
        
            return (ListAliasesRequest) super.clone();
    }

}
    