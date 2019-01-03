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
     * Specify a region (e.g. <code>us-east-2</code>) to only list functions that were created in that region, or
     * <code>ALL</code> to include functions replicated from any region. If specified, you also must specify the
     * <code>FunctionVersion</code>.
     * </p>
     */
    private String masterRegion;
    /**
     * <p>
     * Set to <code>ALL</code> to list all published versions. If not specified, only the latest unpublished version ARN
     * is returned.
     * </p>
     */
    private String functionVersion;
    /**
     * <p>
     * Optional string. An opaque pagination token returned from a previous <code>ListFunctions</code> operation. If
     * present, indicates where to continue the listing.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This parameter
     * value must be greater than 0. The absolute maximum of AWS Lambda functions that can be returned is 50.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * Specify a region (e.g. <code>us-east-2</code>) to only list functions that were created in that region, or
     * <code>ALL</code> to include functions replicated from any region. If specified, you also must specify the
     * <code>FunctionVersion</code>.
     * </p>
     * 
     * @param masterRegion
     *        Specify a region (e.g. <code>us-east-2</code>) to only list functions that were created in that region, or
     *        <code>ALL</code> to include functions replicated from any region. If specified, you also must specify the
     *        <code>FunctionVersion</code>.
     */

    public void setMasterRegion(String masterRegion) {
        this.masterRegion = masterRegion;
    }

    /**
     * <p>
     * Specify a region (e.g. <code>us-east-2</code>) to only list functions that were created in that region, or
     * <code>ALL</code> to include functions replicated from any region. If specified, you also must specify the
     * <code>FunctionVersion</code>.
     * </p>
     * 
     * @return Specify a region (e.g. <code>us-east-2</code>) to only list functions that were created in that region,
     *         or <code>ALL</code> to include functions replicated from any region. If specified, you also must specify
     *         the <code>FunctionVersion</code>.
     */

    public String getMasterRegion() {
        return this.masterRegion;
    }

    /**
     * <p>
     * Specify a region (e.g. <code>us-east-2</code>) to only list functions that were created in that region, or
     * <code>ALL</code> to include functions replicated from any region. If specified, you also must specify the
     * <code>FunctionVersion</code>.
     * </p>
     * 
     * @param masterRegion
     *        Specify a region (e.g. <code>us-east-2</code>) to only list functions that were created in that region, or
     *        <code>ALL</code> to include functions replicated from any region. If specified, you also must specify the
     *        <code>FunctionVersion</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionsRequest withMasterRegion(String masterRegion) {
        setMasterRegion(masterRegion);
        return this;
    }

    /**
     * <p>
     * Set to <code>ALL</code> to list all published versions. If not specified, only the latest unpublished version ARN
     * is returned.
     * </p>
     * 
     * @param functionVersion
     *        Set to <code>ALL</code> to list all published versions. If not specified, only the latest unpublished
     *        version ARN is returned.
     * @see FunctionVersion
     */

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    /**
     * <p>
     * Set to <code>ALL</code> to list all published versions. If not specified, only the latest unpublished version ARN
     * is returned.
     * </p>
     * 
     * @return Set to <code>ALL</code> to list all published versions. If not specified, only the latest unpublished
     *         version ARN is returned.
     * @see FunctionVersion
     */

    public String getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * <p>
     * Set to <code>ALL</code> to list all published versions. If not specified, only the latest unpublished version ARN
     * is returned.
     * </p>
     * 
     * @param functionVersion
     *        Set to <code>ALL</code> to list all published versions. If not specified, only the latest unpublished
     *        version ARN is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionVersion
     */

    public ListFunctionsRequest withFunctionVersion(String functionVersion) {
        setFunctionVersion(functionVersion);
        return this;
    }

    /**
     * <p>
     * Set to <code>ALL</code> to list all published versions. If not specified, only the latest unpublished version ARN
     * is returned.
     * </p>
     * 
     * @param functionVersion
     *        Set to <code>ALL</code> to list all published versions. If not specified, only the latest unpublished
     *        version ARN is returned.
     * @see FunctionVersion
     */

    public void setFunctionVersion(FunctionVersion functionVersion) {
        withFunctionVersion(functionVersion);
    }

    /**
     * <p>
     * Set to <code>ALL</code> to list all published versions. If not specified, only the latest unpublished version ARN
     * is returned.
     * </p>
     * 
     * @param functionVersion
     *        Set to <code>ALL</code> to list all published versions. If not specified, only the latest unpublished
     *        version ARN is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionVersion
     */

    public ListFunctionsRequest withFunctionVersion(FunctionVersion functionVersion) {
        this.functionVersion = functionVersion.toString();
        return this;
    }

    /**
     * <p>
     * Optional string. An opaque pagination token returned from a previous <code>ListFunctions</code> operation. If
     * present, indicates where to continue the listing.
     * </p>
     * 
     * @param marker
     *        Optional string. An opaque pagination token returned from a previous <code>ListFunctions</code> operation.
     *        If present, indicates where to continue the listing.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Optional string. An opaque pagination token returned from a previous <code>ListFunctions</code> operation. If
     * present, indicates where to continue the listing.
     * </p>
     * 
     * @return Optional string. An opaque pagination token returned from a previous <code>ListFunctions</code>
     *         operation. If present, indicates where to continue the listing.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Optional string. An opaque pagination token returned from a previous <code>ListFunctions</code> operation. If
     * present, indicates where to continue the listing.
     * </p>
     * 
     * @param marker
     *        Optional string. An opaque pagination token returned from a previous <code>ListFunctions</code> operation.
     *        If present, indicates where to continue the listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This parameter
     * value must be greater than 0. The absolute maximum of AWS Lambda functions that can be returned is 50.
     * </p>
     * 
     * @param maxItems
     *        Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This
     *        parameter value must be greater than 0. The absolute maximum of AWS Lambda functions that can be returned
     *        is 50.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This parameter
     * value must be greater than 0. The absolute maximum of AWS Lambda functions that can be returned is 50.
     * </p>
     * 
     * @return Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This
     *         parameter value must be greater than 0. The absolute maximum of AWS Lambda functions that can be returned
     *         is 50.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This parameter
     * value must be greater than 0. The absolute maximum of AWS Lambda functions that can be returned is 50.
     * </p>
     * 
     * @param maxItems
     *        Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This
     *        parameter value must be greater than 0. The absolute maximum of AWS Lambda functions that can be returned
     *        is 50.
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
