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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about alerts and warnings that Amazon Lex sends during a migration. The alerts include
 * information about how to resolve the issue.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/MigrationAlert" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MigrationAlert implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of alert. There are two kinds of alerts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ERROR</code> - There was an issue with the migration that can't be resolved. The migration stops.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN</code> - There was an issue with the migration that requires manual changes to the new Amazon Lex V2
     * bot. The migration continues.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * A message that describes why the alert was issued.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Additional details about the alert.
     * </p>
     */
    private java.util.List<String> details;
    /**
     * <p>
     * A link to the Amazon Lex documentation that describes how to resolve the alert.
     * </p>
     */
    private java.util.List<String> referenceURLs;

    /**
     * <p>
     * The type of alert. There are two kinds of alerts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ERROR</code> - There was an issue with the migration that can't be resolved. The migration stops.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN</code> - There was an issue with the migration that requires manual changes to the new Amazon Lex V2
     * bot. The migration continues.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of alert. There are two kinds of alerts:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - There was an issue with the migration that can't be resolved. The migration stops.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARN</code> - There was an issue with the migration that requires manual changes to the new Amazon
     *        Lex V2 bot. The migration continues.
     *        </p>
     *        </li>
     * @see MigrationAlertType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of alert. There are two kinds of alerts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ERROR</code> - There was an issue with the migration that can't be resolved. The migration stops.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN</code> - There was an issue with the migration that requires manual changes to the new Amazon Lex V2
     * bot. The migration continues.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of alert. There are two kinds of alerts:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ERROR</code> - There was an issue with the migration that can't be resolved. The migration stops.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WARN</code> - There was an issue with the migration that requires manual changes to the new Amazon
     *         Lex V2 bot. The migration continues.
     *         </p>
     *         </li>
     * @see MigrationAlertType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of alert. There are two kinds of alerts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ERROR</code> - There was an issue with the migration that can't be resolved. The migration stops.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN</code> - There was an issue with the migration that requires manual changes to the new Amazon Lex V2
     * bot. The migration continues.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of alert. There are two kinds of alerts:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - There was an issue with the migration that can't be resolved. The migration stops.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARN</code> - There was an issue with the migration that requires manual changes to the new Amazon
     *        Lex V2 bot. The migration continues.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationAlertType
     */

    public MigrationAlert withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of alert. There are two kinds of alerts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ERROR</code> - There was an issue with the migration that can't be resolved. The migration stops.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARN</code> - There was an issue with the migration that requires manual changes to the new Amazon Lex V2
     * bot. The migration continues.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of alert. There are two kinds of alerts:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - There was an issue with the migration that can't be resolved. The migration stops.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARN</code> - There was an issue with the migration that requires manual changes to the new Amazon
     *        Lex V2 bot. The migration continues.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationAlertType
     */

    public MigrationAlert withType(MigrationAlertType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A message that describes why the alert was issued.
     * </p>
     * 
     * @param message
     *        A message that describes why the alert was issued.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message that describes why the alert was issued.
     * </p>
     * 
     * @return A message that describes why the alert was issued.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message that describes why the alert was issued.
     * </p>
     * 
     * @param message
     *        A message that describes why the alert was issued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationAlert withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Additional details about the alert.
     * </p>
     * 
     * @return Additional details about the alert.
     */

    public java.util.List<String> getDetails() {
        return details;
    }

    /**
     * <p>
     * Additional details about the alert.
     * </p>
     * 
     * @param details
     *        Additional details about the alert.
     */

    public void setDetails(java.util.Collection<String> details) {
        if (details == null) {
            this.details = null;
            return;
        }

        this.details = new java.util.ArrayList<String>(details);
    }

    /**
     * <p>
     * Additional details about the alert.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetails(java.util.Collection)} or {@link #withDetails(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param details
     *        Additional details about the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationAlert withDetails(String... details) {
        if (this.details == null) {
            setDetails(new java.util.ArrayList<String>(details.length));
        }
        for (String ele : details) {
            this.details.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional details about the alert.
     * </p>
     * 
     * @param details
     *        Additional details about the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationAlert withDetails(java.util.Collection<String> details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * A link to the Amazon Lex documentation that describes how to resolve the alert.
     * </p>
     * 
     * @return A link to the Amazon Lex documentation that describes how to resolve the alert.
     */

    public java.util.List<String> getReferenceURLs() {
        return referenceURLs;
    }

    /**
     * <p>
     * A link to the Amazon Lex documentation that describes how to resolve the alert.
     * </p>
     * 
     * @param referenceURLs
     *        A link to the Amazon Lex documentation that describes how to resolve the alert.
     */

    public void setReferenceURLs(java.util.Collection<String> referenceURLs) {
        if (referenceURLs == null) {
            this.referenceURLs = null;
            return;
        }

        this.referenceURLs = new java.util.ArrayList<String>(referenceURLs);
    }

    /**
     * <p>
     * A link to the Amazon Lex documentation that describes how to resolve the alert.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceURLs(java.util.Collection)} or {@link #withReferenceURLs(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param referenceURLs
     *        A link to the Amazon Lex documentation that describes how to resolve the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationAlert withReferenceURLs(String... referenceURLs) {
        if (this.referenceURLs == null) {
            setReferenceURLs(new java.util.ArrayList<String>(referenceURLs.length));
        }
        for (String ele : referenceURLs) {
            this.referenceURLs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A link to the Amazon Lex documentation that describes how to resolve the alert.
     * </p>
     * 
     * @param referenceURLs
     *        A link to the Amazon Lex documentation that describes how to resolve the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationAlert withReferenceURLs(java.util.Collection<String> referenceURLs) {
        setReferenceURLs(referenceURLs);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getReferenceURLs() != null)
            sb.append("ReferenceURLs: ").append(getReferenceURLs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MigrationAlert == false)
            return false;
        MigrationAlert other = (MigrationAlert) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getReferenceURLs() == null ^ this.getReferenceURLs() == null)
            return false;
        if (other.getReferenceURLs() != null && other.getReferenceURLs().equals(this.getReferenceURLs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getReferenceURLs() == null) ? 0 : getReferenceURLs().hashCode());
        return hashCode;
    }

    @Override
    public MigrationAlert clone() {
        try {
            return (MigrationAlert) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.MigrationAlertMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
