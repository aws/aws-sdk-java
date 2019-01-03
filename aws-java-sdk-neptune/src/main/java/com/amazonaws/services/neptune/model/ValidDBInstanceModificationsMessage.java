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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about valid modifications that you can make to your DB instance. Contains the result of a successful call
 * to the <a>DescribeValidDBInstanceModifications</a> action. You can use this information when you call
 * <a>ModifyDBInstance</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/ValidDBInstanceModificationsMessage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidDBInstanceModificationsMessage implements Serializable, Cloneable {

    /**
     * <p>
     * Valid storage options for your DB instance.
     * </p>
     */
    private java.util.List<ValidStorageOptions> storage;

    /**
     * <p>
     * Valid storage options for your DB instance.
     * </p>
     * 
     * @return Valid storage options for your DB instance.
     */

    public java.util.List<ValidStorageOptions> getStorage() {
        return storage;
    }

    /**
     * <p>
     * Valid storage options for your DB instance.
     * </p>
     * 
     * @param storage
     *        Valid storage options for your DB instance.
     */

    public void setStorage(java.util.Collection<ValidStorageOptions> storage) {
        if (storage == null) {
            this.storage = null;
            return;
        }

        this.storage = new java.util.ArrayList<ValidStorageOptions>(storage);
    }

    /**
     * <p>
     * Valid storage options for your DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorage(java.util.Collection)} or {@link #withStorage(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param storage
     *        Valid storage options for your DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidDBInstanceModificationsMessage withStorage(ValidStorageOptions... storage) {
        if (this.storage == null) {
            setStorage(new java.util.ArrayList<ValidStorageOptions>(storage.length));
        }
        for (ValidStorageOptions ele : storage) {
            this.storage.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Valid storage options for your DB instance.
     * </p>
     * 
     * @param storage
     *        Valid storage options for your DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidDBInstanceModificationsMessage withStorage(java.util.Collection<ValidStorageOptions> storage) {
        setStorage(storage);
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
        if (getStorage() != null)
            sb.append("Storage: ").append(getStorage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidDBInstanceModificationsMessage == false)
            return false;
        ValidDBInstanceModificationsMessage other = (ValidDBInstanceModificationsMessage) obj;
        if (other.getStorage() == null ^ this.getStorage() == null)
            return false;
        if (other.getStorage() != null && other.getStorage().equals(this.getStorage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorage() == null) ? 0 : getStorage().hashCode());
        return hashCode;
    }

    @Override
    public ValidDBInstanceModificationsMessage clone() {
        try {
            return (ValidDBInstanceModificationsMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
