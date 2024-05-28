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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information of supported layouts for server-side composition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/LayoutConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LayoutConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration related to grid layout. Default: Grid layout.
     * </p>
     */
    private GridConfiguration grid;
    /**
     * <p>
     * Configuration related to PiP layout.
     * </p>
     */
    private PipConfiguration pip;

    /**
     * <p>
     * Configuration related to grid layout. Default: Grid layout.
     * </p>
     * 
     * @param grid
     *        Configuration related to grid layout. Default: Grid layout.
     */

    public void setGrid(GridConfiguration grid) {
        this.grid = grid;
    }

    /**
     * <p>
     * Configuration related to grid layout. Default: Grid layout.
     * </p>
     * 
     * @return Configuration related to grid layout. Default: Grid layout.
     */

    public GridConfiguration getGrid() {
        return this.grid;
    }

    /**
     * <p>
     * Configuration related to grid layout. Default: Grid layout.
     * </p>
     * 
     * @param grid
     *        Configuration related to grid layout. Default: Grid layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayoutConfiguration withGrid(GridConfiguration grid) {
        setGrid(grid);
        return this;
    }

    /**
     * <p>
     * Configuration related to PiP layout.
     * </p>
     * 
     * @param pip
     *        Configuration related to PiP layout.
     */

    public void setPip(PipConfiguration pip) {
        this.pip = pip;
    }

    /**
     * <p>
     * Configuration related to PiP layout.
     * </p>
     * 
     * @return Configuration related to PiP layout.
     */

    public PipConfiguration getPip() {
        return this.pip;
    }

    /**
     * <p>
     * Configuration related to PiP layout.
     * </p>
     * 
     * @param pip
     *        Configuration related to PiP layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayoutConfiguration withPip(PipConfiguration pip) {
        setPip(pip);
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
        if (getGrid() != null)
            sb.append("Grid: ").append(getGrid()).append(",");
        if (getPip() != null)
            sb.append("Pip: ").append(getPip());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LayoutConfiguration == false)
            return false;
        LayoutConfiguration other = (LayoutConfiguration) obj;
        if (other.getGrid() == null ^ this.getGrid() == null)
            return false;
        if (other.getGrid() != null && other.getGrid().equals(this.getGrid()) == false)
            return false;
        if (other.getPip() == null ^ this.getPip() == null)
            return false;
        if (other.getPip() != null && other.getPip().equals(this.getPip()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrid() == null) ? 0 : getGrid().hashCode());
        hashCode = prime * hashCode + ((getPip() == null) ? 0 : getPip().hashCode());
        return hashCode;
    }

    @Override
    public LayoutConfiguration clone() {
        try {
            return (LayoutConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.LayoutConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
