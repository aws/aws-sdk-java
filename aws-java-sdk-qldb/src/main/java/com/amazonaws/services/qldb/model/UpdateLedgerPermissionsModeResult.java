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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/UpdateLedgerPermissionsMode" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLedgerPermissionsModeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ledger.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ledger.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The current permissions mode of the ledger.
     * </p>
     */
    private String permissionsMode;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param name
     *        The name of the ledger.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @return The name of the ledger.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param name
     *        The name of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLedgerPermissionsModeResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ledger.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the ledger.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ledger.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the ledger.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ledger.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLedgerPermissionsModeResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The current permissions mode of the ledger.
     * </p>
     * 
     * @param permissionsMode
     *        The current permissions mode of the ledger.
     * @see PermissionsMode
     */

    public void setPermissionsMode(String permissionsMode) {
        this.permissionsMode = permissionsMode;
    }

    /**
     * <p>
     * The current permissions mode of the ledger.
     * </p>
     * 
     * @return The current permissions mode of the ledger.
     * @see PermissionsMode
     */

    public String getPermissionsMode() {
        return this.permissionsMode;
    }

    /**
     * <p>
     * The current permissions mode of the ledger.
     * </p>
     * 
     * @param permissionsMode
     *        The current permissions mode of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionsMode
     */

    public UpdateLedgerPermissionsModeResult withPermissionsMode(String permissionsMode) {
        setPermissionsMode(permissionsMode);
        return this;
    }

    /**
     * <p>
     * The current permissions mode of the ledger.
     * </p>
     * 
     * @param permissionsMode
     *        The current permissions mode of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionsMode
     */

    public UpdateLedgerPermissionsModeResult withPermissionsMode(PermissionsMode permissionsMode) {
        this.permissionsMode = permissionsMode.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getPermissionsMode() != null)
            sb.append("PermissionsMode: ").append(getPermissionsMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLedgerPermissionsModeResult == false)
            return false;
        UpdateLedgerPermissionsModeResult other = (UpdateLedgerPermissionsModeResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPermissionsMode() == null ^ this.getPermissionsMode() == null)
            return false;
        if (other.getPermissionsMode() != null && other.getPermissionsMode().equals(this.getPermissionsMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPermissionsMode() == null) ? 0 : getPermissionsMode().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLedgerPermissionsModeResult clone() {
        try {
            return (UpdateLedgerPermissionsModeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
