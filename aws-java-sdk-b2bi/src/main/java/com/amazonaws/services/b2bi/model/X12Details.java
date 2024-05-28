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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the X12 transaction set and version. The X12 structure is used when the system transforms
 * an EDI (electronic data interchange) file.
 * </p>
 * <note>
 * <p>
 * If an EDI input file contains more than one transaction, each transaction must have the same transaction set and
 * version, for example 214/4010. If not, the transformer cannot parse the file.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/X12Details" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class X12Details implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Returns an enumerated type where each value identifies an X12 transaction set. Transaction sets are maintained by
     * the X12 Accredited Standards Committee.
     * </p>
     */
    private String transactionSet;
    /**
     * <p>
     * Returns the version to use for the specified X12 transaction set.
     * 
     * <pre>
     * <code> &lt;/p&gt; </code>
     * </pre>
     */
    private String version;

    /**
     * <p>
     * Returns an enumerated type where each value identifies an X12 transaction set. Transaction sets are maintained by
     * the X12 Accredited Standards Committee.
     * </p>
     * 
     * @param transactionSet
     *        Returns an enumerated type where each value identifies an X12 transaction set. Transaction sets are
     *        maintained by the X12 Accredited Standards Committee.
     * @see X12TransactionSet
     */

    public void setTransactionSet(String transactionSet) {
        this.transactionSet = transactionSet;
    }

    /**
     * <p>
     * Returns an enumerated type where each value identifies an X12 transaction set. Transaction sets are maintained by
     * the X12 Accredited Standards Committee.
     * </p>
     * 
     * @return Returns an enumerated type where each value identifies an X12 transaction set. Transaction sets are
     *         maintained by the X12 Accredited Standards Committee.
     * @see X12TransactionSet
     */

    public String getTransactionSet() {
        return this.transactionSet;
    }

    /**
     * <p>
     * Returns an enumerated type where each value identifies an X12 transaction set. Transaction sets are maintained by
     * the X12 Accredited Standards Committee.
     * </p>
     * 
     * @param transactionSet
     *        Returns an enumerated type where each value identifies an X12 transaction set. Transaction sets are
     *        maintained by the X12 Accredited Standards Committee.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see X12TransactionSet
     */

    public X12Details withTransactionSet(String transactionSet) {
        setTransactionSet(transactionSet);
        return this;
    }

    /**
     * <p>
     * Returns an enumerated type where each value identifies an X12 transaction set. Transaction sets are maintained by
     * the X12 Accredited Standards Committee.
     * </p>
     * 
     * @param transactionSet
     *        Returns an enumerated type where each value identifies an X12 transaction set. Transaction sets are
     *        maintained by the X12 Accredited Standards Committee.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see X12TransactionSet
     */

    public X12Details withTransactionSet(X12TransactionSet transactionSet) {
        this.transactionSet = transactionSet.toString();
        return this;
    }

    /**
     * <p>
     * Returns the version to use for the specified X12 transaction set.
     * 
     * <pre>
     * <code> &lt;/p&gt; </code>
     * </pre>
     * 
     * @param version
     *        Returns the version to use for the specified X12 transaction set.
     * 
     *        <pre>
     * 
     *        <code> &lt;/p&gt; </code> @see X12Version
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Returns the version to use for the specified X12 transaction set.
     * 
     * <pre>
     * <code> &lt;/p&gt; </code>
     * </pre>
     * 
     * @return Returns the version to use for the specified X12 transaction set.
     * 
     *         <pre>
     * 
     *         <code> &lt;/p&gt; </code> @see X12Version
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Returns the version to use for the specified X12 transaction set.
     * 
     * <pre>
     * <code> &lt;/p&gt; </code>
     * </pre>
     * 
     * @param version
     *        Returns the version to use for the specified X12 transaction set.
     * 
     *        <pre>
     * 
     *        <code> &lt;/p&gt; </code> @return Returns a reference to this object so that method calls can be chained
     *        together. @see X12Version
     */

    public X12Details withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Returns the version to use for the specified X12 transaction set.
     * 
     * <pre>
     * <code> &lt;/p&gt; </code>
     * </pre>
     * 
     * @param version
     *        Returns the version to use for the specified X12 transaction set.
     * 
     *        <pre>
     * 
     *        <code> &lt;/p&gt; </code> @return Returns a reference to this object so that method calls can be chained
     *        together. @see X12Version
     */

    public X12Details withVersion(X12Version version) {
        this.version = version.toString();
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
        if (getTransactionSet() != null)
            sb.append("TransactionSet: ").append(getTransactionSet()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof X12Details == false)
            return false;
        X12Details other = (X12Details) obj;
        if (other.getTransactionSet() == null ^ this.getTransactionSet() == null)
            return false;
        if (other.getTransactionSet() != null && other.getTransactionSet().equals(this.getTransactionSet()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransactionSet() == null) ? 0 : getTransactionSet().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public X12Details clone() {
        try {
            return (X12Details) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.b2bi.model.transform.X12DetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
