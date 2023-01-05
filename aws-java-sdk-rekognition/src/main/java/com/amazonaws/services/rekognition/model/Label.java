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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure containing details about the detected label, including the name, detected instances, parent labels, and
 * level of confidence.
 * </p>
 * <p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Label implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name (label) of the object or scene.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Level of confidence.
     * </p>
     */
    private Float confidence;
    /**
     * <p>
     * If <code>Label</code> represents an object, <code>Instances</code> contains the bounding boxes for each instance
     * of the detected object. Bounding boxes are returned for common object labels such as people, cars, furniture,
     * apparel or pets.
     * </p>
     */
    private java.util.List<Instance> instances;
    /**
     * <p>
     * The parent labels for a label. The response includes all ancestor labels.
     * </p>
     */
    private java.util.List<Parent> parents;
    /**
     * <p>
     * A list of potential aliases for a given label.
     * </p>
     */
    private java.util.List<LabelAlias> aliases;
    /**
     * <p>
     * A list of the categories associated with a given label.
     * </p>
     */
    private java.util.List<LabelCategory> categories;

    /**
     * <p>
     * The name (label) of the object or scene.
     * </p>
     * 
     * @param name
     *        The name (label) of the object or scene.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name (label) of the object or scene.
     * </p>
     * 
     * @return The name (label) of the object or scene.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name (label) of the object or scene.
     * </p>
     * 
     * @param name
     *        The name (label) of the object or scene.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Label withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Level of confidence.
     * </p>
     * 
     * @param confidence
     *        Level of confidence.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Level of confidence.
     * </p>
     * 
     * @return Level of confidence.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * Level of confidence.
     * </p>
     * 
     * @param confidence
     *        Level of confidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Label withConfidence(Float confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * If <code>Label</code> represents an object, <code>Instances</code> contains the bounding boxes for each instance
     * of the detected object. Bounding boxes are returned for common object labels such as people, cars, furniture,
     * apparel or pets.
     * </p>
     * 
     * @return If <code>Label</code> represents an object, <code>Instances</code> contains the bounding boxes for each
     *         instance of the detected object. Bounding boxes are returned for common object labels such as people,
     *         cars, furniture, apparel or pets.
     */

    public java.util.List<Instance> getInstances() {
        return instances;
    }

    /**
     * <p>
     * If <code>Label</code> represents an object, <code>Instances</code> contains the bounding boxes for each instance
     * of the detected object. Bounding boxes are returned for common object labels such as people, cars, furniture,
     * apparel or pets.
     * </p>
     * 
     * @param instances
     *        If <code>Label</code> represents an object, <code>Instances</code> contains the bounding boxes for each
     *        instance of the detected object. Bounding boxes are returned for common object labels such as people,
     *        cars, furniture, apparel or pets.
     */

    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<Instance>(instances);
    }

    /**
     * <p>
     * If <code>Label</code> represents an object, <code>Instances</code> contains the bounding boxes for each instance
     * of the detected object. Bounding boxes are returned for common object labels such as people, cars, furniture,
     * apparel or pets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        If <code>Label</code> represents an object, <code>Instances</code> contains the bounding boxes for each
     *        instance of the detected object. Bounding boxes are returned for common object labels such as people,
     *        cars, furniture, apparel or pets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Label withInstances(Instance... instances) {
        if (this.instances == null) {
            setInstances(new java.util.ArrayList<Instance>(instances.length));
        }
        for (Instance ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If <code>Label</code> represents an object, <code>Instances</code> contains the bounding boxes for each instance
     * of the detected object. Bounding boxes are returned for common object labels such as people, cars, furniture,
     * apparel or pets.
     * </p>
     * 
     * @param instances
     *        If <code>Label</code> represents an object, <code>Instances</code> contains the bounding boxes for each
     *        instance of the detected object. Bounding boxes are returned for common object labels such as people,
     *        cars, furniture, apparel or pets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Label withInstances(java.util.Collection<Instance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The parent labels for a label. The response includes all ancestor labels.
     * </p>
     * 
     * @return The parent labels for a label. The response includes all ancestor labels.
     */

    public java.util.List<Parent> getParents() {
        return parents;
    }

    /**
     * <p>
     * The parent labels for a label. The response includes all ancestor labels.
     * </p>
     * 
     * @param parents
     *        The parent labels for a label. The response includes all ancestor labels.
     */

    public void setParents(java.util.Collection<Parent> parents) {
        if (parents == null) {
            this.parents = null;
            return;
        }

        this.parents = new java.util.ArrayList<Parent>(parents);
    }

    /**
     * <p>
     * The parent labels for a label. The response includes all ancestor labels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParents(java.util.Collection)} or {@link #withParents(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param parents
     *        The parent labels for a label. The response includes all ancestor labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Label withParents(Parent... parents) {
        if (this.parents == null) {
            setParents(new java.util.ArrayList<Parent>(parents.length));
        }
        for (Parent ele : parents) {
            this.parents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parent labels for a label. The response includes all ancestor labels.
     * </p>
     * 
     * @param parents
     *        The parent labels for a label. The response includes all ancestor labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Label withParents(java.util.Collection<Parent> parents) {
        setParents(parents);
        return this;
    }

    /**
     * <p>
     * A list of potential aliases for a given label.
     * </p>
     * 
     * @return A list of potential aliases for a given label.
     */

    public java.util.List<LabelAlias> getAliases() {
        return aliases;
    }

    /**
     * <p>
     * A list of potential aliases for a given label.
     * </p>
     * 
     * @param aliases
     *        A list of potential aliases for a given label.
     */

    public void setAliases(java.util.Collection<LabelAlias> aliases) {
        if (aliases == null) {
            this.aliases = null;
            return;
        }

        this.aliases = new java.util.ArrayList<LabelAlias>(aliases);
    }

    /**
     * <p>
     * A list of potential aliases for a given label.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliases(java.util.Collection)} or {@link #withAliases(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param aliases
     *        A list of potential aliases for a given label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Label withAliases(LabelAlias... aliases) {
        if (this.aliases == null) {
            setAliases(new java.util.ArrayList<LabelAlias>(aliases.length));
        }
        for (LabelAlias ele : aliases) {
            this.aliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of potential aliases for a given label.
     * </p>
     * 
     * @param aliases
     *        A list of potential aliases for a given label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Label withAliases(java.util.Collection<LabelAlias> aliases) {
        setAliases(aliases);
        return this;
    }

    /**
     * <p>
     * A list of the categories associated with a given label.
     * </p>
     * 
     * @return A list of the categories associated with a given label.
     */

    public java.util.List<LabelCategory> getCategories() {
        return categories;
    }

    /**
     * <p>
     * A list of the categories associated with a given label.
     * </p>
     * 
     * @param categories
     *        A list of the categories associated with a given label.
     */

    public void setCategories(java.util.Collection<LabelCategory> categories) {
        if (categories == null) {
            this.categories = null;
            return;
        }

        this.categories = new java.util.ArrayList<LabelCategory>(categories);
    }

    /**
     * <p>
     * A list of the categories associated with a given label.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategories(java.util.Collection)} or {@link #withCategories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param categories
     *        A list of the categories associated with a given label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Label withCategories(LabelCategory... categories) {
        if (this.categories == null) {
            setCategories(new java.util.ArrayList<LabelCategory>(categories.length));
        }
        for (LabelCategory ele : categories) {
            this.categories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the categories associated with a given label.
     * </p>
     * 
     * @param categories
     *        A list of the categories associated with a given label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Label withCategories(java.util.Collection<LabelCategory> categories) {
        setCategories(categories);
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
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getParents() != null)
            sb.append("Parents: ").append(getParents()).append(",");
        if (getAliases() != null)
            sb.append("Aliases: ").append(getAliases()).append(",");
        if (getCategories() != null)
            sb.append("Categories: ").append(getCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Label == false)
            return false;
        Label other = (Label) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getParents() == null ^ this.getParents() == null)
            return false;
        if (other.getParents() != null && other.getParents().equals(this.getParents()) == false)
            return false;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
            return false;
        if (other.getCategories() == null ^ this.getCategories() == null)
            return false;
        if (other.getCategories() != null && other.getCategories().equals(this.getCategories()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getParents() == null) ? 0 : getParents().hashCode());
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        return hashCode;
    }

    @Override
    public Label clone() {
        try {
            return (Label) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.LabelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
