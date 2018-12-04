/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFunctionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Optional string. If not specified, will return only regular function versions (i.e., non-replicated versions).
     * </p>
     * <p>
     * Valid values are:
     * </p>
     * <p>
     * The region from which the functions are replicated. For example, if you specify <code>us-east-1</code>, only
     * functions replicated from that region will be returned.
     * </p>
     * <p>
     * <code>ALL</code>: Will return all functions from any region. If specified, you also must specify a valid
     * FunctionVersion parameter.
     * </p>
     */
    private String masterRegion;
    /**
     * <p>
     * Optional string. If not specified, only the unqualified functions ARNs (Amazon Resource Names) will be returned.
     * </p>
     * <p>
     * Valid value:
     * </p>
     * <p>
     * <code>ALL</code>: Will return all versions, including <code>$LATEST</code> which will have fully qualified ARNs
     * (Amazon Resource Names).
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
     * value must be greater than 0.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * Optional string. If not specified, will return only regular function versions (i.e., non-replicated versions).
     * </p>
     * <p>
     * Valid values are:
     * </p>
     * <p>
     * The region from which the functions are replicated. For example, if you specify <code>us-east-1</code>, only
     * functions replicated from that region will be returned.
     * </p>
     * <p>
     * <code>ALL</code>: Will return all functions from any region. If specified, you also must specify a valid
     * FunctionVersion parameter.
     * </p>
     * 
     * @param masterRegion
     *        Optional string. If not specified, will return only regular function versions (i.e., non-replicated
     *        versions).</p>
     *        <p>
     *        Valid values are:
     *        </p>
     *        <p>
     *        The region from which the functions are replicated. For example, if you specify <code>us-east-1</code>,
     *        only functions replicated from that region will be returned.
     *        </p>
     *        <p>
     *        <code>ALL</code>: Will return all functions from any region. If specified, you also must specify a valid
     *        FunctionVersion parameter.
     */

    public void setMasterRegion(String masterRegion) {
        this.masterRegion = masterRegion;
    }

    /**
     * <p>
     * Optional string. If not specified, will return only regular function versions (i.e., non-replicated versions).
     * </p>
     * <p>
     * Valid values are:
     * </p>
     * <p>
     * The region from which the functions are replicated. For example, if you specify <code>us-east-1</code>, only
     * functions replicated from that region will be returned.
     * </p>
     * <p>
     * <code>ALL</code>: Will return all functions from any region. If specified, you also must specify a valid
     * FunctionVersion parameter.
     * </p>
     * 
     * @return Optional string. If not specified, will return only regular function versions (i.e., non-replicated
     *         versions).</p>
     *         <p>
     *         Valid values are:
     *         </p>
     *         <p>
     *         The region from which the functions are replicated. For example, if you specify <code>us-east-1</code>,
     *         only functions replicated from that region will be returned.
     *         </p>
     *         <p>
     *         <code>ALL</code>: Will return all functions from any region. If specified, you also must specify a valid
     *         FunctionVersion parameter.
     */

    public String getMasterRegion() {
        return this.masterRegion;
    }

    /**
     * <p>
     * Optional string. If not specified, will return only regular function versions (i.e., non-replicated versions).
     * </p>
     * <p>
     * Valid values are:
     * </p>
     * <p>
     * The region from which the functions are replicated. For example, if you specify <code>us-east-1</code>, only
     * functions replicated from that region will be returned.
     * </p>
     * <p>
     * <code>ALL</code>: Will return all functions from any region. If specified, you also must specify a valid
     * FunctionVersion parameter.
     * </p>
     * 
     * @param masterRegion
     *        Optional string. If not specified, will return only regular function versions (i.e., non-replicated
     *        versions).</p>
     *        <p>
     *        Valid values are:
     *        </p>
     *        <p>
     *        The region from which the functions are replicated. For example, if you specify <code>us-east-1</code>,
     *        only functions replicated from that region will be returned.
     *        </p>
     *        <p>
     *        <code>ALL</code>: Will return all functions from any region. If specified, you also must specify a valid
     *        FunctionVersion parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionsRequest withMasterRegion(String masterRegion) {
        setMasterRegion(masterRegion);
        return this;
    }

    /**
     * <p>
     * Optional string. If not specified, only the unqualified functions ARNs (Amazon Resource Names) will be returned.
     * </p>
     * <p>
     * Valid value:
     * </p>
     * <p>
     * <code>ALL</code>: Will return all versions, including <code>$LATEST</code> which will have fully qualified ARNs
     * (Amazon Resource Names).
     * </p>
     * 
     * @param functionVersion
     *        Optional string. If not specified, only the unqualified functions ARNs (Amazon Resource Names) will be
     *        returned.</p>
     *        <p>
     *        Valid value:
     *        </p>
     *        <p>
     *        <code>ALL</code>: Will return all versions, including <code>$LATEST</code> which will have fully qualified
     *        ARNs (Amazon Resource Names).
     * @see FunctionVersion
     */

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    /**
     * <p>
     * Optional string. If not specified, only the unqualified functions ARNs (Amazon Resource Names) will be returned.
     * </p>
     * <p>
     * Valid value:
     * </p>
     * <p>
     * <code>ALL</code>: Will return all versions, including <code>$LATEST</code> which will have fully qualified ARNs
     * (Amazon Resource Names).
     * </p>
     * 
     * @return Optional string. If not specified, only the unqualified functions ARNs (Amazon Resource Names) will be
     *         returned.</p>
     *         <p>
     *         Valid value:
     *         </p>
     *         <p>
     *         <code>ALL</code>: Will return all versions, including <code>$LATEST</code> which will have fully
     *         qualified ARNs (Amazon Resource Names).
     * @see FunctionVersion
     */

    public String getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * <p>
     * Optional string. If not specified, only the unqualified functions ARNs (Amazon Resource Names) will be returned.
     * </p>
     * <p>
     * Valid value:
     * </p>
     * <p>
     * <code>ALL</code>: Will return all versions, including <code>$LATEST</code> which will have fully qualified ARNs
     * (Amazon Resource Names).
     * </p>
     * 
     * @param functionVersion
     *        Optional string. If not specified, only the unqualified functions ARNs (Amazon Resource Names) will be
     *        returned.</p>
     *        <p>
     *        Valid value:
     *        </p>
     *        <p>
     *        <code>ALL</code>: Will return all versions, including <code>$LATEST</code> which will have fully qualified
     *        ARNs (Amazon Resource Names).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionVersion
     */

    public ListFunctionsRequest withFunctionVersion(String functionVersion) {
        setFunctionVersion(functionVersion);
        return this;
    }

    /**
     * <p>
     * Optional string. If not specified, only the unqualified functions ARNs (Amazon Resource Names) will be returned.
     * </p>
     * <p>
     * Valid value:
     * </p>
     * <p>
     * <code>ALL</code>: Will return all versions, including <code>$LATEST</code> which will have fully qualified ARNs
     * (Amazon Resource Names).
     * </p>
     * 
     * @param functionVersion
     *        Optional string. If not specified, only the unqualified functions ARNs (Amazon Resource Names) will be
     *        returned.</p>
     *        <p>
     *        Valid value:
     *        </p>
     *        <p>
     *        <code>ALL</code>: Will return all versions, including <code>$LATEST</code> which will have fully qualified
     *        ARNs (Amazon Resource Names).
     * @see FunctionVersion
     */

    public void setFunctionVersion(FunctionVersion functionVersion) {
        withFunctionVersion(functionVersion);
    }

    /**
     * <p>
     * Optional string. If not specified, only the unqualified functions ARNs (Amazon Resource Names) will be returned.
     * </p>
     * <p>
     * Valid value:
     * </p>
     * <p>
     * <code>ALL</code>: Will return all versions, including <code>$LATEST</code> which will have fully qualified ARNs
     * (Amazon Resource Names).
     * </p>
     * 
     * @param functionVersion
     *        Optional string. If not specified, only the unqualified functions ARNs (Amazon Resource Names) will be
     *        returned.</p>
     *        <p>
     *        Valid value:
     *        </p>
     *        <p>
     *        <code>ALL</code>: Will return all versions, including <code>$LATEST</code> which will have fully qualified
     *        ARNs (Amazon Resource Names).
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
     * value must be greater than 0.
     * </p>
     * 
     * @param maxItems
     *        Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This
     *        parameter value must be greater than 0.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This parameter
     * value must be greater than 0.
     * </p>
     * 
     * @return Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This
     *         parameter value must be greater than 0.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This parameter
     * value must be greater than 0.
     * </p>
     * 
     * @param maxItems
     *        Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This
     *        parameter value must be greater than 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionsRequest withMaxItems(Integer maxItems) {
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
