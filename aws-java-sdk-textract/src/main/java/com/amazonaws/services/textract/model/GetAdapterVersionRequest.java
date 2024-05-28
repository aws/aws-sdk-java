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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetAdapterVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAdapterVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string specifying a unique ID for the adapter version you want to retrieve information for.
     * </p>
     */
    private String adapterId;
    /**
     * <p>
     * A string specifying the adapter version you want to retrieve information for.
     * </p>
     */
    private String adapterVersion;

    /**
     * <p>
     * A string specifying a unique ID for the adapter version you want to retrieve information for.
     * </p>
     * 
     * @param adapterId
     *        A string specifying a unique ID for the adapter version you want to retrieve information for.
     */

    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A string specifying a unique ID for the adapter version you want to retrieve information for.
     * </p>
     * 
     * @return A string specifying a unique ID for the adapter version you want to retrieve information for.
     */

    public String getAdapterId() {
        return this.adapterId;
    }

    /**
     * <p>
     * A string specifying a unique ID for the adapter version you want to retrieve information for.
     * </p>
     * 
     * @param adapterId
     *        A string specifying a unique ID for the adapter version you want to retrieve information for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterVersionRequest withAdapterId(String adapterId) {
        setAdapterId(adapterId);
        return this;
    }

    /**
     * <p>
     * A string specifying the adapter version you want to retrieve information for.
     * </p>
     * 
     * @param adapterVersion
     *        A string specifying the adapter version you want to retrieve information for.
     */

    public void setAdapterVersion(String adapterVersion) {
        this.adapterVersion = adapterVersion;
    }

    /**
     * <p>
     * A string specifying the adapter version you want to retrieve information for.
     * </p>
     * 
     * @return A string specifying the adapter version you want to retrieve information for.
     */

    public String getAdapterVersion() {
        return this.adapterVersion;
    }

    /**
     * <p>
     * A string specifying the adapter version you want to retrieve information for.
     * </p>
     * 
     * @param adapterVersion
     *        A string specifying the adapter version you want to retrieve information for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterVersionRequest withAdapterVersion(String adapterVersion) {
        setAdapterVersion(adapterVersion);
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
        if (getAdapterId() != null)
            sb.append("AdapterId: ").append(getAdapterId()).append(",");
        if (getAdapterVersion() != null)
            sb.append("AdapterVersion: ").append(getAdapterVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAdapterVersionRequest == false)
            return false;
        GetAdapterVersionRequest other = (GetAdapterVersionRequest) obj;
        if (other.getAdapterId() == null ^ this.getAdapterId() == null)
            return false;
        if (other.getAdapterId() != null && other.getAdapterId().equals(this.getAdapterId()) == false)
            return false;
        if (other.getAdapterVersion() == null ^ this.getAdapterVersion() == null)
            return false;
        if (other.getAdapterVersion() != null && other.getAdapterVersion().equals(this.getAdapterVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdapterId() == null) ? 0 : getAdapterId().hashCode());
        hashCode = prime * hashCode + ((getAdapterVersion() == null) ? 0 : getAdapterVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetAdapterVersionRequest clone() {
        return (GetAdapterVersionRequest) super.clone();
    }

}
