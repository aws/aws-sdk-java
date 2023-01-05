/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCell" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCellRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cell.
     * </p>
     */
    private String cellName;

    /**
     * <p>
     * The name of the cell.
     * </p>
     * 
     * @param cellName
     *        The name of the cell.
     */

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    /**
     * <p>
     * The name of the cell.
     * </p>
     * 
     * @return The name of the cell.
     */

    public String getCellName() {
        return this.cellName;
    }

    /**
     * <p>
     * The name of the cell.
     * </p>
     * 
     * @param cellName
     *        The name of the cell.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCellRequest withCellName(String cellName) {
        setCellName(cellName);
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
        if (getCellName() != null)
            sb.append("CellName: ").append(getCellName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCellRequest == false)
            return false;
        GetCellRequest other = (GetCellRequest) obj;
        if (other.getCellName() == null ^ this.getCellName() == null)
            return false;
        if (other.getCellName() != null && other.getCellName().equals(this.getCellName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCellName() == null) ? 0 : getCellName().hashCode());
        return hashCode;
    }

    @Override
    public GetCellRequest clone() {
        return (GetCellRequest) super.clone();
    }

}
