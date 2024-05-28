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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddBridgeSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddBridgeSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The Amazon Resource Number (ARN) of the bridge. */
    private String bridgeArn;
    /** The sources that you added to this bridge. */
    private java.util.List<BridgeSource> sources;

    /**
     * The Amazon Resource Number (ARN) of the bridge.
     * 
     * @param bridgeArn
     *        The Amazon Resource Number (ARN) of the bridge.
     */

    public void setBridgeArn(String bridgeArn) {
        this.bridgeArn = bridgeArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the bridge.
     * 
     * @return The Amazon Resource Number (ARN) of the bridge.
     */

    public String getBridgeArn() {
        return this.bridgeArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the bridge.
     * 
     * @param bridgeArn
     *        The Amazon Resource Number (ARN) of the bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddBridgeSourcesResult withBridgeArn(String bridgeArn) {
        setBridgeArn(bridgeArn);
        return this;
    }

    /**
     * The sources that you added to this bridge.
     * 
     * @return The sources that you added to this bridge.
     */

    public java.util.List<BridgeSource> getSources() {
        return sources;
    }

    /**
     * The sources that you added to this bridge.
     * 
     * @param sources
     *        The sources that you added to this bridge.
     */

    public void setSources(java.util.Collection<BridgeSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<BridgeSource>(sources);
    }

    /**
     * The sources that you added to this bridge.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The sources that you added to this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddBridgeSourcesResult withSources(BridgeSource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<BridgeSource>(sources.length));
        }
        for (BridgeSource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * The sources that you added to this bridge.
     * 
     * @param sources
     *        The sources that you added to this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddBridgeSourcesResult withSources(java.util.Collection<BridgeSource> sources) {
        setSources(sources);
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
        if (getBridgeArn() != null)
            sb.append("BridgeArn: ").append(getBridgeArn()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddBridgeSourcesResult == false)
            return false;
        AddBridgeSourcesResult other = (AddBridgeSourcesResult) obj;
        if (other.getBridgeArn() == null ^ this.getBridgeArn() == null)
            return false;
        if (other.getBridgeArn() != null && other.getBridgeArn().equals(this.getBridgeArn()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBridgeArn() == null) ? 0 : getBridgeArn().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public AddBridgeSourcesResult clone() {
        try {
            return (AddBridgeSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
