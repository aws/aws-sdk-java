/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctionsByCodeSigningConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFunctionsByCodeSigningConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The The Amazon Resource Name (ARN) of the code signing configuration.
     * </p>
     */
    private String codeSigningConfigArn;
    /**
     * <p>
     * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Maximum number of items to return.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * The The Amazon Resource Name (ARN) of the code signing configuration.
     * </p>
     * 
     * @param codeSigningConfigArn
     *        The The Amazon Resource Name (ARN) of the code signing configuration.
     */

    public void setCodeSigningConfigArn(String codeSigningConfigArn) {
        this.codeSigningConfigArn = codeSigningConfigArn;
    }

    /**
     * <p>
     * The The Amazon Resource Name (ARN) of the code signing configuration.
     * </p>
     * 
     * @return The The Amazon Resource Name (ARN) of the code signing configuration.
     */

    public String getCodeSigningConfigArn() {
        return this.codeSigningConfigArn;
    }

    /**
     * <p>
     * The The Amazon Resource Name (ARN) of the code signing configuration.
     * </p>
     * 
     * @param codeSigningConfigArn
     *        The The Amazon Resource Name (ARN) of the code signing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionsByCodeSigningConfigRequest withCodeSigningConfigArn(String codeSigningConfigArn) {
        setCodeSigningConfigArn(codeSigningConfigArn);
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

    public ListFunctionsByCodeSigningConfigRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Maximum number of items to return.
     * </p>
     * 
     * @param maxItems
     *        Maximum number of items to return.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Maximum number of items to return.
     * </p>
     * 
     * @return Maximum number of items to return.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Maximum number of items to return.
     * </p>
     * 
     * @param maxItems
     *        Maximum number of items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionsByCodeSigningConfigRequest withMaxItems(Integer maxItems) {
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
        if (getCodeSigningConfigArn() != null)
            sb.append("CodeSigningConfigArn: ").append(getCodeSigningConfigArn()).append(",");
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

        if (obj instanceof ListFunctionsByCodeSigningConfigRequest == false)
            return false;
        ListFunctionsByCodeSigningConfigRequest other = (ListFunctionsByCodeSigningConfigRequest) obj;
        if (other.getCodeSigningConfigArn() == null ^ this.getCodeSigningConfigArn() == null)
            return false;
        if (other.getCodeSigningConfigArn() != null && other.getCodeSigningConfigArn().equals(this.getCodeSigningConfigArn()) == false)
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

        hashCode = prime * hashCode + ((getCodeSigningConfigArn() == null) ? 0 : getCodeSigningConfigArn().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListFunctionsByCodeSigningConfigRequest clone() {
        return (ListFunctionsByCodeSigningConfigRequest) super.clone();
    }

}
