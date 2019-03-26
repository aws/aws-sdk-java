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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Classifiers are triggered during a crawl task. A classifier checks whether a given file is in a format it can handle,
 * and if it is, the classifier creates a schema in the form of a <code>StructType</code> object that matches that data
 * format.
 * </p>
 * <p>
 * You can use the standard classifiers that AWS Glue supplies, or you can write your own classifiers to best categorize
 * your data sources and specify the appropriate schemas to use for them. A classifier can be a <code>grok</code>
 * classifier, an <code>XML</code> classifier, a <code>JSON</code> classifier, or a custom <code>CSV</code> classifier
 * as specified in one of the fields in the <code>Classifier</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Classifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Classifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>GrokClassifier</code> object.
     * </p>
     */
    private GrokClassifier grokClassifier;
    /**
     * <p>
     * An <code>XMLClassifier</code> object.
     * </p>
     */
    private XMLClassifier xMLClassifier;
    /**
     * <p>
     * A <code>JsonClassifier</code> object.
     * </p>
     */
    private JsonClassifier jsonClassifier;
    /**
     * <p>
     * A <code>CSVClassifier</code> object.
     * </p>
     */
    private CsvClassifier csvClassifier;

    /**
     * <p>
     * A <code>GrokClassifier</code> object.
     * </p>
     * 
     * @param grokClassifier
     *        A <code>GrokClassifier</code> object.
     */

    public void setGrokClassifier(GrokClassifier grokClassifier) {
        this.grokClassifier = grokClassifier;
    }

    /**
     * <p>
     * A <code>GrokClassifier</code> object.
     * </p>
     * 
     * @return A <code>GrokClassifier</code> object.
     */

    public GrokClassifier getGrokClassifier() {
        return this.grokClassifier;
    }

    /**
     * <p>
     * A <code>GrokClassifier</code> object.
     * </p>
     * 
     * @param grokClassifier
     *        A <code>GrokClassifier</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Classifier withGrokClassifier(GrokClassifier grokClassifier) {
        setGrokClassifier(grokClassifier);
        return this;
    }

    /**
     * <p>
     * An <code>XMLClassifier</code> object.
     * </p>
     * 
     * @param xMLClassifier
     *        An <code>XMLClassifier</code> object.
     */

    public void setXMLClassifier(XMLClassifier xMLClassifier) {
        this.xMLClassifier = xMLClassifier;
    }

    /**
     * <p>
     * An <code>XMLClassifier</code> object.
     * </p>
     * 
     * @return An <code>XMLClassifier</code> object.
     */

    public XMLClassifier getXMLClassifier() {
        return this.xMLClassifier;
    }

    /**
     * <p>
     * An <code>XMLClassifier</code> object.
     * </p>
     * 
     * @param xMLClassifier
     *        An <code>XMLClassifier</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Classifier withXMLClassifier(XMLClassifier xMLClassifier) {
        setXMLClassifier(xMLClassifier);
        return this;
    }

    /**
     * <p>
     * A <code>JsonClassifier</code> object.
     * </p>
     * 
     * @param jsonClassifier
     *        A <code>JsonClassifier</code> object.
     */

    public void setJsonClassifier(JsonClassifier jsonClassifier) {
        this.jsonClassifier = jsonClassifier;
    }

    /**
     * <p>
     * A <code>JsonClassifier</code> object.
     * </p>
     * 
     * @return A <code>JsonClassifier</code> object.
     */

    public JsonClassifier getJsonClassifier() {
        return this.jsonClassifier;
    }

    /**
     * <p>
     * A <code>JsonClassifier</code> object.
     * </p>
     * 
     * @param jsonClassifier
     *        A <code>JsonClassifier</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Classifier withJsonClassifier(JsonClassifier jsonClassifier) {
        setJsonClassifier(jsonClassifier);
        return this;
    }

    /**
     * <p>
     * A <code>CSVClassifier</code> object.
     * </p>
     * 
     * @param csvClassifier
     *        A <code>CSVClassifier</code> object.
     */

    public void setCsvClassifier(CsvClassifier csvClassifier) {
        this.csvClassifier = csvClassifier;
    }

    /**
     * <p>
     * A <code>CSVClassifier</code> object.
     * </p>
     * 
     * @return A <code>CSVClassifier</code> object.
     */

    public CsvClassifier getCsvClassifier() {
        return this.csvClassifier;
    }

    /**
     * <p>
     * A <code>CSVClassifier</code> object.
     * </p>
     * 
     * @param csvClassifier
     *        A <code>CSVClassifier</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Classifier withCsvClassifier(CsvClassifier csvClassifier) {
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

        if (obj instanceof Classifier == false)
            return false;
        Classifier other = (Classifier) obj;
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
    public Classifier clone() {
        try {
            return (Classifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ClassifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
