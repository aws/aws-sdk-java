/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListAliasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Lambda function name for which the alias is created.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * If you specify this optional parameter, the API returns only the aliases that are pointing to the specific Lambda
     * function version, otherwise the API returns all of the aliases created for the Lambda function.
     * </p>
     */
    private String functionVersion;
    /**
     * <p>
     * Optional string. An opaque pagination token returned from a previous <code>ListAliases</code> operation. If
     * present, indicates where to continue the listing.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Optional integer. Specifies the maximum number of aliases to return in response. This parameter value must be
     * greater than 0.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * Lambda function name for which the alias is created.
     * </p>
     * 
     * @param functionName
     *        Lambda function name for which the alias is created.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * Lambda function name for which the alias is created.
     * </p>
     * 
     * @return Lambda function name for which the alias is created.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * Lambda function name for which the alias is created.
     * </p>
     * 
     * @param functionName
     *        Lambda function name for which the alias is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * If you specify this optional parameter, the API returns only the aliases that are pointing to the specific Lambda
     * function version, otherwise the API returns all of the aliases created for the Lambda function.
     * </p>
     * 
     * @param functionVersion
     *        If you specify this optional parameter, the API returns only the aliases that are pointing to the specific
     *        Lambda function version, otherwise the API returns all of the aliases created for the Lambda function.
     */

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    /**
     * <p>
     * If you specify this optional parameter, the API returns only the aliases that are pointing to the specific Lambda
     * function version, otherwise the API returns all of the aliases created for the Lambda function.
     * </p>
     * 
     * @return If you specify this optional parameter, the API returns only the aliases that are pointing to the
     *         specific Lambda function version, otherwise the API returns all of the aliases created for the Lambda
     *         function.
     */

    public String getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * <p>
     * If you specify this optional parameter, the API returns only the aliases that are pointing to the specific Lambda
     * function version, otherwise the API returns all of the aliases created for the Lambda function.
     * </p>
     * 
     * @param functionVersion
     *        If you specify this optional parameter, the API returns only the aliases that are pointing to the specific
     *        Lambda function version, otherwise the API returns all of the aliases created for the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withFunctionVersion(String functionVersion) {
        setFunctionVersion(functionVersion);
        return this;
    }

    /**
     * <p>
     * Optional string. An opaque pagination token returned from a previous <code>ListAliases</code> operation. If
     * present, indicates where to continue the listing.
     * </p>
     * 
     * @param marker
     *        Optional string. An opaque pagination token returned from a previous <code>ListAliases</code> operation.
     *        If present, indicates where to continue the listing.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Optional string. An opaque pagination token returned from a previous <code>ListAliases</code> operation. If
     * present, indicates where to continue the listing.
     * </p>
     * 
     * @return Optional string. An opaque pagination token returned from a previous <code>ListAliases</code> operation.
     *         If present, indicates where to continue the listing.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Optional string. An opaque pagination token returned from a previous <code>ListAliases</code> operation. If
     * present, indicates where to continue the listing.
     * </p>
     * 
     * @param marker
     *        Optional string. An opaque pagination token returned from a previous <code>ListAliases</code> operation.
     *        If present, indicates where to continue the listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Optional integer. Specifies the maximum number of aliases to return in response. This parameter value must be
     * greater than 0.
     * </p>
     * 
     * @param maxItems
     *        Optional integer. Specifies the maximum number of aliases to return in response. This parameter value must
     *        be greater than 0.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Optional integer. Specifies the maximum number of aliases to return in response. This parameter value must be
     * greater than 0.
     * </p>
     * 
     * @return Optional integer. Specifies the maximum number of aliases to return in response. This parameter value
     *         must be greater than 0.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Optional integer. Specifies the maximum number of aliases to return in response. This parameter value must be
     * greater than 0.
     * </p>
     * 
     * @param maxItems
     *        Optional integer. Specifies the maximum number of aliases to return in response. This parameter value must
     *        be greater than 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFunctionName() != null)
            sb.append("FunctionName: " + getFunctionName() + ",");
        if (getFunctionVersion() != null)
            sb.append("FunctionVersion: " + getFunctionVersion() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAliasesRequest == false)
            return false;
        ListAliasesRequest other = (ListAliasesRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getFunctionVersion() == null ^ this.getFunctionVersion() == null)
            return false;
        if (other.getFunctionVersion() != null && other.getFunctionVersion().equals(this.getFunctionVersion()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
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
    public ListAliasesRequest clone() {
        return (ListAliasesRequest) super.clone();
    }
}
