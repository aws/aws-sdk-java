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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFunctionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * For Lambda@Edge functions, the AWS Region of the master function. For example, <code>us-east-2</code> or
     * <code>ALL</code>. If specified, you must set <code>FunctionVersion</code> to <code>ALL</code>.
     * </p>
     */
    private String masterRegion;
    /**
     * <p>
     * Set to <code>ALL</code> to include entries for all published versions of each function.
     * </p>
     */
    private String functionVersion;
    /**
     * <p>
     * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Specify a value between 1 and 50 to limit the number of functions in the response.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * For Lambda@Edge functions, the AWS Region of the master function. For example, <code>us-east-2</code> or
     * <code>ALL</code>. If specified, you must set <code>FunctionVersion</code> to <code>ALL</code>.
     * </p>
     * 
     * @param masterRegion
     *        For Lambda@Edge functions, the AWS Region of the master function. For example, <code>us-east-2</code> or
     *        <code>ALL</code>. If specified, you must set <code>FunctionVersion</code> to <code>ALL</code>.
     */

    public void setMasterRegion(String masterRegion) {
        this.masterRegion = masterRegion;
    }

    /**
     * <p>
     * For Lambda@Edge functions, the AWS Region of the master function. For example, <code>us-east-2</code> or
     * <code>ALL</code>. If specified, you must set <code>FunctionVersion</code> to <code>ALL</code>.
     * </p>
     * 
     * @return For Lambda@Edge functions, the AWS Region of the master function. For example, <code>us-east-2</code> or
     *         <code>ALL</code>. If specified, you must set <code>FunctionVersion</code> to <code>ALL</code>.
     */

    public String getMasterRegion() {
        return this.masterRegion;
    }

    /**
     * <p>
     * For Lambda@Edge functions, the AWS Region of the master function. For example, <code>us-east-2</code> or
     * <code>ALL</code>. If specified, you must set <code>FunctionVersion</code> to <code>ALL</code>.
     * </p>
     * 
     * @param masterRegion
     *        For Lambda@Edge functions, the AWS Region of the master function. For example, <code>us-east-2</code> or
     *        <code>ALL</code>. If specified, you must set <code>FunctionVersion</code> to <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionsRequest withMasterRegion(String masterRegion) {
        setMasterRegion(masterRegion);
        return this;
    }

    /**
     * <p>
     * Set to <code>ALL</code> to include entries for all published versions of each function.
     * </p>
     * 
     * @param functionVersion
     *        Set to <code>ALL</code> to include entries for all published versions of each function.
     * @see FunctionVersion
     */

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    /**
     * <p>
     * Set to <code>ALL</code> to include entries for all published versions of each function.
     * </p>
     * 
     * @return Set to <code>ALL</code> to include entries for all published versions of each function.
     * @see FunctionVersion
     */

    public String getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * <p>
     * Set to <code>ALL</code> to include entries for all published versions of each function.
     * </p>
     * 
     * @param functionVersion
     *        Set to <code>ALL</code> to include entries for all published versions of each function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionVersion
     */

    public ListFunctionsRequest withFunctionVersion(String functionVersion) {
        setFunctionVersion(functionVersion);
        return this;
    }

    /**
     * <p>
     * Set to <code>ALL</code> to include entries for all published versions of each function.
     * </p>
     * 
     * @param functionVersion
     *        Set to <code>ALL</code> to include entries for all published versions of each function.
     * @see FunctionVersion
     */

    public void setFunctionVersion(FunctionVersion functionVersion) {
        withFunctionVersion(functionVersion);
    }

    /**
     * <p>
     * Set to <code>ALL</code> to include entries for all published versions of each function.
     * </p>
     * 
     * @param functionVersion
     *        Set to <code>ALL</code> to include entries for all published versions of each function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionVersion
     */

    public ListFunctionsRequest withFunctionVersion(FunctionVersion functionVersion) {
        this.functionVersion = functionVersion.toString();
        return this;
    }

    /**
     * <p>
     * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param marker
     *        Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param marker
     *        Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Specify a value between 1 and 50 to limit the number of functions in the response.
     * </p>
     * 
     * @param maxItems
     *        Specify a value between 1 and 50 to limit the number of functions in the response.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Specify a value between 1 and 50 to limit the number of functions in the response.
     * </p>
     * 
     * @return Specify a value between 1 and 50 to limit the number of functions in the response.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Specify a value between 1 and 50 to limit the number of functions in the response.
     * </p>
     * 
     * @param maxItems
     *        Specify a value between 1 and 50 to limit the number of functions in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getMasterRegion() != null)
            sb.append("MasterRegion: ").append(getMasterRegion()).append(",");
        if (getFunctionVersion() != null)
            sb.append("FunctionVersion: ").append(getFunctionVersion()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFunctionsRequest == false)
            return false;
        ListFunctionsRequest other = (ListFunctionsRequest) obj;
        if (other.getMasterRegion() == null ^ this.getMasterRegion() == null)
            return false;
        if (other.getMasterRegion() != null && other.getMasterRegion().equals(this.getMasterRegion()) == false)
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

        hashCode = prime * hashCode + ((getMasterRegion() == null) ? 0 : getMasterRegion().hashCode());
        hashCode = prime * hashCode + ((getFunctionVersion() == null) ? 0 : getFunctionVersion().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListFunctionsRequest clone() {
        return (ListFunctionsRequest) super.clone();
    }

}
