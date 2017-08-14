/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Classifiers are written in Python and triggered during a Crawl Task. You can write your own Classifiers to best
 * categorize your data sources and specify the appropriate schemas to use for them. A Classifier first checks whether a
 * given file is in a format it can handle, and then, if so, creates a schema in the form of a <code>StructType</code>
 * object that matches that data format.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Classifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Classifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A GrokClassifier object.
     * </p>
     */
    private GrokClassifier grokClassifier;

    /**
     * <p>
     * A GrokClassifier object.
     * </p>
     * 
     * @param grokClassifier
     *        A GrokClassifier object.
     */

    public void setGrokClassifier(GrokClassifier grokClassifier) {
        this.grokClassifier = grokClassifier;
    }

    /**
     * <p>
     * A GrokClassifier object.
     * </p>
     * 
     * @return A GrokClassifier object.
     */

    public GrokClassifier getGrokClassifier() {
        return this.grokClassifier;
    }

    /**
     * <p>
     * A GrokClassifier object.
     * </p>
     * 
     * @param grokClassifier
     *        A GrokClassifier object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Classifier withGrokClassifier(GrokClassifier grokClassifier) {
        setGrokClassifier(grokClassifier);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("GrokClassifier: ").append(getGrokClassifier());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrokClassifier() == null) ? 0 : getGrokClassifier().hashCode());
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
