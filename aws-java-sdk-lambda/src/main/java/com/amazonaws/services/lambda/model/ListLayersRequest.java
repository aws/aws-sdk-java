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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLayersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A runtime identifier. For example, <code>java21</code>.
     * </p>
     * <p>
     * The following list includes deprecated runtimes. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-support-policy">Runtime
     * deprecation policy</a>.
     * </p>
     */
    private String compatibleRuntime;
    /**
     * <p>
     * A pagination token returned by a previous call.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of layers to return.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * The compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html">instruction set
     * architecture</a>.
     * </p>
     */
    private String compatibleArchitecture;

    /**
     * <p>
     * A runtime identifier. For example, <code>java21</code>.
     * </p>
     * <p>
     * The following list includes deprecated runtimes. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-support-policy">Runtime
     * deprecation policy</a>.
     * </p>
     * 
     * @param compatibleRuntime
     *        A runtime identifier. For example, <code>java21</code>.</p>
     *        <p>
     *        The following list includes deprecated runtimes. For more information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-support-policy">Runtime
     *        deprecation policy</a>.
     * @see Runtime
     */

    public void setCompatibleRuntime(String compatibleRuntime) {
        this.compatibleRuntime = compatibleRuntime;
    }

    /**
     * <p>
     * A runtime identifier. For example, <code>java21</code>.
     * </p>
     * <p>
     * The following list includes deprecated runtimes. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-support-policy">Runtime
     * deprecation policy</a>.
     * </p>
     * 
     * @return A runtime identifier. For example, <code>java21</code>.</p>
     *         <p>
     *         The following list includes deprecated runtimes. For more information, see <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-support-policy">Runtime
     *         deprecation policy</a>.
     * @see Runtime
     */

    public String getCompatibleRuntime() {
        return this.compatibleRuntime;
    }

    /**
     * <p>
     * A runtime identifier. For example, <code>java21</code>.
     * </p>
     * <p>
     * The following list includes deprecated runtimes. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-support-policy">Runtime
     * deprecation policy</a>.
     * </p>
     * 
     * @param compatibleRuntime
     *        A runtime identifier. For example, <code>java21</code>.</p>
     *        <p>
     *        The following list includes deprecated runtimes. For more information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-support-policy">Runtime
     *        deprecation policy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public ListLayersRequest withCompatibleRuntime(String compatibleRuntime) {
        setCompatibleRuntime(compatibleRuntime);
        return this;
    }

    /**
     * <p>
     * A runtime identifier. For example, <code>java21</code>.
     * </p>
     * <p>
     * The following list includes deprecated runtimes. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-support-policy">Runtime
     * deprecation policy</a>.
     * </p>
     * 
     * @param compatibleRuntime
     *        A runtime identifier. For example, <code>java21</code>.</p>
     *        <p>
     *        The following list includes deprecated runtimes. For more information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-support-policy">Runtime
     *        deprecation policy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public ListLayersRequest withCompatibleRuntime(Runtime compatibleRuntime) {
        this.compatibleRuntime = compatibleRuntime.toString();
        return this;
    }

    /**
     * <p>
     * A pagination token returned by a previous call.
     * </p>
     * 
     * @param marker
     *        A pagination token returned by a previous call.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token returned by a previous call.
     * </p>
     * 
     * @return A pagination token returned by a previous call.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token returned by a previous call.
     * </p>
     * 
     * @param marker
     *        A pagination token returned by a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLayersRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of layers to return.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of layers to return.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of layers to return.
     * </p>
     * 
     * @return The maximum number of layers to return.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of layers to return.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of layers to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLayersRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html">instruction set
     * architecture</a>.
     * </p>
     * 
     * @param compatibleArchitecture
     *        The compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html">instruction set
     *        architecture</a>.
     * @see Architecture
     */

    public void setCompatibleArchitecture(String compatibleArchitecture) {
        this.compatibleArchitecture = compatibleArchitecture;
    }

    /**
     * <p>
     * The compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html">instruction set
     * architecture</a>.
     * </p>
     * 
     * @return The compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html">instruction
     *         set architecture</a>.
     * @see Architecture
     */

    public String getCompatibleArchitecture() {
        return this.compatibleArchitecture;
    }

    /**
     * <p>
     * The compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html">instruction set
     * architecture</a>.
     * </p>
     * 
     * @param compatibleArchitecture
     *        The compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html">instruction set
     *        architecture</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public ListLayersRequest withCompatibleArchitecture(String compatibleArchitecture) {
        setCompatibleArchitecture(compatibleArchitecture);
        return this;
    }

    /**
     * <p>
     * The compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html">instruction set
     * architecture</a>.
     * </p>
     * 
     * @param compatibleArchitecture
     *        The compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html">instruction set
     *        architecture</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public ListLayersRequest withCompatibleArchitecture(Architecture compatibleArchitecture) {
        this.compatibleArchitecture = compatibleArchitecture.toString();
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
        if (getCompatibleRuntime() != null)
            sb.append("CompatibleRuntime: ").append(getCompatibleRuntime()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getCompatibleArchitecture() != null)
            sb.append("CompatibleArchitecture: ").append(getCompatibleArchitecture());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLayersRequest == false)
            return false;
        ListLayersRequest other = (ListLayersRequest) obj;
        if (other.getCompatibleRuntime() == null ^ this.getCompatibleRuntime() == null)
            return false;
        if (other.getCompatibleRuntime() != null && other.getCompatibleRuntime().equals(this.getCompatibleRuntime()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getCompatibleArchitecture() == null ^ this.getCompatibleArchitecture() == null)
            return false;
        if (other.getCompatibleArchitecture() != null && other.getCompatibleArchitecture().equals(this.getCompatibleArchitecture()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompatibleRuntime() == null) ? 0 : getCompatibleRuntime().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getCompatibleArchitecture() == null) ? 0 : getCompatibleArchitecture().hashCode());
        return hashCode;
    }

    @Override
    public ListLayersRequest clone() {
        return (ListLayersRequest) super.clone();
    }

}
