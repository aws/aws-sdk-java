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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateClassifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateClassifierRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>GrokClassifier</code> object with updated fields.
     * </p>
     */
    private UpdateGrokClassifierRequest grokClassifier;
    /**
     * <p>
     * An <code>XMLClassifier</code> object with updated fields.
     * </p>
     */
    private UpdateXMLClassifierRequest xMLClassifier;
    /**
     * <p>
     * A <code>JsonClassifier</code> object with updated fields.
     * </p>
     */
    private UpdateJsonClassifierRequest jsonClassifier;
    /**
     * <p>
     * A <code>CsvClassifier</code> object with updated fields.
     * </p>
     */
    private UpdateCsvClassifierRequest csvClassifier;

    /**
     * <p>
     * A <code>GrokClassifier</code> object with updated fields.
     * </p>
     * 
     * @param grokClassifier
     *        A <code>GrokClassifier</code> object with updated fields.
     */

    public void setGrokClassifier(UpdateGrokClassifierRequest grokClassifier) {
        this.grokClassifier = grokClassifier;
    }

    /**
     * <p>
     * A <code>GrokClassifier</code> object with updated fields.
     * </p>
     * 
     * @return A <code>GrokClassifier</code> object with updated fields.
     */

    public UpdateGrokClassifierRequest getGrokClassifier() {
        return this.grokClassifier;
    }

    /**
     * <p>
     * A <code>GrokClassifier</code> object with updated fields.
     * </p>
     * 
     * @param grokClassifier
     *        A <code>GrokClassifier</code> object with updated fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClassifierRequest withGrokClassifier(UpdateGrokClassifierRequest grokClassifier) {
        setGrokClassifier(grokClassifier);
        return this;
    }

    /**
     * <p>
     * An <code>XMLClassifier</code> object with updated fields.
     * </p>
     * 
     * @param xMLClassifier
     *        An <code>XMLClassifier</code> object with updated fields.
     */

    public void setXMLClassifier(UpdateXMLClassifierRequest xMLClassifier) {
        this.xMLClassifier = xMLClassifier;
    }

    /**
     * <p>
     * An <code>XMLClassifier</code> object with updated fields.
     * </p>
     * 
     * @return An <code>XMLClassifier</code> object with updated fields.
     */

    public UpdateXMLClassifierRequest getXMLClassifier() {
        return this.xMLClassifier;
    }

    /**
     * <p>
     * An <code>XMLClassifier</code> object with updated fields.
     * </p>
     * 
     * @param xMLClassifier
     *        An <code>XMLClassifier</code> object with updated fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClassifierRequest withXMLClassifier(UpdateXMLClassifierRequest xMLClassifier) {
        setXMLClassifier(xMLClassifier);
        return this;
    }

    /**
     * <p>
     * A <code>JsonClassifier</code> object with updated fields.
     * </p>
     * 
     * @param jsonClassifier
     *        A <code>JsonClassifier</code> object with updated fields.
     */

    public void setJsonClassifier(UpdateJsonClassifierRequest jsonClassifier) {
        this.jsonClassifier = jsonClassifier;
    }

    /**
     * <p>
     * A <code>JsonClassifier</code> object with updated fields.
     * </p>
     * 
     * @return A <code>JsonClassifier</code> object with updated fields.
     */

    public UpdateJsonClassifierRequest getJsonClassifier() {
        return this.jsonClassifier;
    }

    /**
     * <p>
     * A <code>JsonClassifier</code> object with updated fields.
     * </p>
     * 
     * @param jsonClassifier
     *        A <code>JsonClassifier</code> object with updated fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClassifierRequest withJsonClassifier(UpdateJsonClassifierRequest jsonClassifier) {
        setJsonClassifier(jsonClassifier);
        return this;
    }

    /**
     * <p>
     * A <code>CsvClassifier</code> object with updated fields.
     * </p>
     * 
     * @param csvClassifier
     *        A <code>CsvClassifier</code> object with updated fields.
     */

    public void setCsvClassifier(UpdateCsvClassifierRequest csvClassifier) {
        this.csvClassifier = csvClassifier;
    }

    /**
     * <p>
     * A <code>CsvClassifier</code> object with updated fields.
     * </p>
     * 
     * @return A <code>CsvClassifier</code> object with updated fields.
     */

    public UpdateCsvClassifierRequest getCsvClassifier() {
        return this.csvClassifier;
    }

    /**
     * <p>
     * A <code>CsvClassifier</code> object with updated fields.
     * </p>
     * 
     * @param csvClassifier
     *        A <code>CsvClassifier</code> object with updated fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClassifierRequest withCsvClassifier(UpdateCsvClassifierRequest csvClassifier) {
        setCsvClassifier(csvClassifier);
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
        if (getGrokClassifier() != null)
            sb.append("GrokClassifier: ").append(getGrokClassifier()).append(",");
        if (getXMLClassifier() != null)
            sb.append("XMLClassifier: ").append(getXMLClassifier()).append(",");
        if (getJsonClassifier() != null)
            sb.append("JsonClassifier: ").append(getJsonClassifier()).append(",");
        if (getCsvClassifier() != null)
            sb.append("CsvClassifier: ").append(getCsvClassifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClassifierRequest == false)
            return false;
        UpdateClassifierRequest other = (UpdateClassifierRequest) obj;
        if (other.getGrokClassifier() == null ^ this.getGrokClassifier() == null)
            return false;
        if (other.getGrokClassifier() != null && other.getGrokClassifier().equals(this.getGrokClassifier()) == false)
            return false;
        if (other.getXMLClassifier() == null ^ this.getXMLClassifier() == null)
            return false;
        if (other.getXMLClassifier() != null && other.getXMLClassifier().equals(this.getXMLClassifier()) == false)
            return false;
        if (other.getJsonClassifier() == null ^ this.getJsonClassifier() == null)
            return false;
        if (other.getJsonClassifier() != null && other.getJsonClassifier().equals(this.getJsonClassifier()) == false)
            return false;
        if (other.getCsvClassifier() == null ^ this.getCsvClassifier() == null)
            return false;
        if (other.getCsvClassifier() != null && other.getCsvClassifier().equals(this.getCsvClassifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrokClassifier() == null) ? 0 : getGrokClassifier().hashCode());
        hashCode = prime * hashCode + ((getXMLClassifier() == null) ? 0 : getXMLClassifier().hashCode());
        hashCode = prime * hashCode + ((getJsonClassifier() == null) ? 0 : getJsonClassifier().hashCode());
        hashCode = prime * hashCode + ((getCsvClassifier() == null) ? 0 : getCsvClassifier().hashCode());
        return hashCode;
    }

    @Override
    public UpdateClassifierRequest clone() {
        return (UpdateClassifierRequest) super.clone();
    }

}
