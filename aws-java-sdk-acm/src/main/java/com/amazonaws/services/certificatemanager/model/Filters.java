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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure can be used in the <a>ListCertificates</a> action to filter the output of the certificate list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/Filters" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify one or more <a>ExtendedKeyUsage</a> extension values.
     * </p>
     */
    private java.util.List<String> extendedKeyUsage;
    /**
     * <p>
     * Specify one or more <a>KeyUsage</a> extension values.
     * </p>
     */
    private java.util.List<String> keyUsage;
    /**
     * <p>
     * Specify one or more algorithms that can be used to generate key pairs.
     * </p>
     */
    private java.util.List<String> keyTypes;

    /**
     * <p>
     * Specify one or more <a>ExtendedKeyUsage</a> extension values.
     * </p>
     * 
     * @return Specify one or more <a>ExtendedKeyUsage</a> extension values.
     * @see ExtendedKeyUsageName
     */

    public java.util.List<String> getExtendedKeyUsage() {
        return extendedKeyUsage;
    }

    /**
     * <p>
     * Specify one or more <a>ExtendedKeyUsage</a> extension values.
     * </p>
     * 
     * @param extendedKeyUsage
     *        Specify one or more <a>ExtendedKeyUsage</a> extension values.
     * @see ExtendedKeyUsageName
     */

    public void setExtendedKeyUsage(java.util.Collection<String> extendedKeyUsage) {
        if (extendedKeyUsage == null) {
            this.extendedKeyUsage = null;
            return;
        }

        this.extendedKeyUsage = new java.util.ArrayList<String>(extendedKeyUsage);
    }

    /**
     * <p>
     * Specify one or more <a>ExtendedKeyUsage</a> extension values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExtendedKeyUsage(java.util.Collection)} or {@link #withExtendedKeyUsage(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param extendedKeyUsage
     *        Specify one or more <a>ExtendedKeyUsage</a> extension values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtendedKeyUsageName
     */

    public Filters withExtendedKeyUsage(String... extendedKeyUsage) {
        if (this.extendedKeyUsage == null) {
            setExtendedKeyUsage(new java.util.ArrayList<String>(extendedKeyUsage.length));
        }
        for (String ele : extendedKeyUsage) {
            this.extendedKeyUsage.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify one or more <a>ExtendedKeyUsage</a> extension values.
     * </p>
     * 
     * @param extendedKeyUsage
     *        Specify one or more <a>ExtendedKeyUsage</a> extension values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtendedKeyUsageName
     */

    public Filters withExtendedKeyUsage(java.util.Collection<String> extendedKeyUsage) {
        setExtendedKeyUsage(extendedKeyUsage);
        return this;
    }

    /**
     * <p>
     * Specify one or more <a>ExtendedKeyUsage</a> extension values.
     * </p>
     * 
     * @param extendedKeyUsage
     *        Specify one or more <a>ExtendedKeyUsage</a> extension values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtendedKeyUsageName
     */

    public Filters withExtendedKeyUsage(ExtendedKeyUsageName... extendedKeyUsage) {
        java.util.ArrayList<String> extendedKeyUsageCopy = new java.util.ArrayList<String>(extendedKeyUsage.length);
        for (ExtendedKeyUsageName value : extendedKeyUsage) {
            extendedKeyUsageCopy.add(value.toString());
        }
        if (getExtendedKeyUsage() == null) {
            setExtendedKeyUsage(extendedKeyUsageCopy);
        } else {
            getExtendedKeyUsage().addAll(extendedKeyUsageCopy);
        }
        return this;
    }

    /**
     * <p>
     * Specify one or more <a>KeyUsage</a> extension values.
     * </p>
     * 
     * @return Specify one or more <a>KeyUsage</a> extension values.
     * @see KeyUsageName
     */

    public java.util.List<String> getKeyUsage() {
        return keyUsage;
    }

    /**
     * <p>
     * Specify one or more <a>KeyUsage</a> extension values.
     * </p>
     * 
     * @param keyUsage
     *        Specify one or more <a>KeyUsage</a> extension values.
     * @see KeyUsageName
     */

    public void setKeyUsage(java.util.Collection<String> keyUsage) {
        if (keyUsage == null) {
            this.keyUsage = null;
            return;
        }

        this.keyUsage = new java.util.ArrayList<String>(keyUsage);
    }

    /**
     * <p>
     * Specify one or more <a>KeyUsage</a> extension values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyUsage(java.util.Collection)} or {@link #withKeyUsage(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param keyUsage
     *        Specify one or more <a>KeyUsage</a> extension values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsageName
     */

    public Filters withKeyUsage(String... keyUsage) {
        if (this.keyUsage == null) {
            setKeyUsage(new java.util.ArrayList<String>(keyUsage.length));
        }
        for (String ele : keyUsage) {
            this.keyUsage.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify one or more <a>KeyUsage</a> extension values.
     * </p>
     * 
     * @param keyUsage
     *        Specify one or more <a>KeyUsage</a> extension values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsageName
     */

    public Filters withKeyUsage(java.util.Collection<String> keyUsage) {
        setKeyUsage(keyUsage);
        return this;
    }

    /**
     * <p>
     * Specify one or more <a>KeyUsage</a> extension values.
     * </p>
     * 
     * @param keyUsage
     *        Specify one or more <a>KeyUsage</a> extension values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsageName
     */

    public Filters withKeyUsage(KeyUsageName... keyUsage) {
        java.util.ArrayList<String> keyUsageCopy = new java.util.ArrayList<String>(keyUsage.length);
        for (KeyUsageName value : keyUsage) {
            keyUsageCopy.add(value.toString());
        }
        if (getKeyUsage() == null) {
            setKeyUsage(keyUsageCopy);
        } else {
            getKeyUsage().addAll(keyUsageCopy);
        }
        return this;
    }

    /**
     * <p>
     * Specify one or more algorithms that can be used to generate key pairs.
     * </p>
     * 
     * @return Specify one or more algorithms that can be used to generate key pairs.
     * @see KeyAlgorithm
     */

    public java.util.List<String> getKeyTypes() {
        return keyTypes;
    }

    /**
     * <p>
     * Specify one or more algorithms that can be used to generate key pairs.
     * </p>
     * 
     * @param keyTypes
     *        Specify one or more algorithms that can be used to generate key pairs.
     * @see KeyAlgorithm
     */

    public void setKeyTypes(java.util.Collection<String> keyTypes) {
        if (keyTypes == null) {
            this.keyTypes = null;
            return;
        }

        this.keyTypes = new java.util.ArrayList<String>(keyTypes);
    }

    /**
     * <p>
     * Specify one or more algorithms that can be used to generate key pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyTypes(java.util.Collection)} or {@link #withKeyTypes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param keyTypes
     *        Specify one or more algorithms that can be used to generate key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public Filters withKeyTypes(String... keyTypes) {
        if (this.keyTypes == null) {
            setKeyTypes(new java.util.ArrayList<String>(keyTypes.length));
        }
        for (String ele : keyTypes) {
            this.keyTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify one or more algorithms that can be used to generate key pairs.
     * </p>
     * 
     * @param keyTypes
     *        Specify one or more algorithms that can be used to generate key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public Filters withKeyTypes(java.util.Collection<String> keyTypes) {
        setKeyTypes(keyTypes);
        return this;
    }

    /**
     * <p>
     * Specify one or more algorithms that can be used to generate key pairs.
     * </p>
     * 
     * @param keyTypes
     *        Specify one or more algorithms that can be used to generate key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public Filters withKeyTypes(KeyAlgorithm... keyTypes) {
        java.util.ArrayList<String> keyTypesCopy = new java.util.ArrayList<String>(keyTypes.length);
        for (KeyAlgorithm value : keyTypes) {
            keyTypesCopy.add(value.toString());
        }
        if (getKeyTypes() == null) {
            setKeyTypes(keyTypesCopy);
        } else {
            getKeyTypes().addAll(keyTypesCopy);
        }
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
        if (getExtendedKeyUsage() != null)
            sb.append("ExtendedKeyUsage: ").append(getExtendedKeyUsage()).append(",");
        if (getKeyUsage() != null)
            sb.append("KeyUsage: ").append(getKeyUsage()).append(",");
        if (getKeyTypes() != null)
            sb.append("KeyTypes: ").append(getKeyTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filters == false)
            return false;
        Filters other = (Filters) obj;
        if (other.getExtendedKeyUsage() == null ^ this.getExtendedKeyUsage() == null)
            return false;
        if (other.getExtendedKeyUsage() != null && other.getExtendedKeyUsage().equals(this.getExtendedKeyUsage()) == false)
            return false;
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null)
            return false;
        if (other.getKeyUsage() != null && other.getKeyUsage().equals(this.getKeyUsage()) == false)
            return false;
        if (other.getKeyTypes() == null ^ this.getKeyTypes() == null)
            return false;
        if (other.getKeyTypes() != null && other.getKeyTypes().equals(this.getKeyTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExtendedKeyUsage() == null) ? 0 : getExtendedKeyUsage().hashCode());
        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        hashCode = prime * hashCode + ((getKeyTypes() == null) ? 0 : getKeyTypes().hashCode());
        return hashCode;
    }

    @Override
    public Filters clone() {
        try {
            return (Filters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.certificatemanager.model.transform.FiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
