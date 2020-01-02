/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Specify the details for each additional DASH manifest that you want the service to generate for this output group.
 * Each manifest can reference a different subset of outputs in the group.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DashAdditionalManifest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashAdditionalManifest implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify a name modifier that the service adds to the name of this manifest to make it different from the file
     * names of the other main manifests in the output group. For example, say that the default main manifest for your
     * DASH group is film-name.mpd. If you enter "-no-premium" for this setting, then the file name the service generates
     * for this top-level manifest is film-name-no-premium.mpd.
     */
    private String manifestNameModifier;
    /** Specify the outputs that you want this additional top-level manifest to reference. */
    private java.util.List<String> selectedOutputs;

    /**
     * Specify a name modifier that the service adds to the name of this manifest to make it different from the file
     * names of the other main manifests in the output group. For example, say that the default main manifest for your
     * DASH group is film-name.mpd. If you enter "-no-premium" for this setting, then the file name the service generates
     * for this top-level manifest is film-name-no-premium.mpd.
     * 
     * @param manifestNameModifier
     *        Specify a name modifier that the service adds to the name of this manifest to make it different from the
     *        file names of the other main manifests in the output group. For example, say that the default main
     *        manifest for your DASH group is film-name.mpd. If you enter "-no-premium" for this setting, then the file
     *        name the service generates for this top-level manifest is film-name-no-premium.mpd.
     */

    public void setManifestNameModifier(String manifestNameModifier) {
        this.manifestNameModifier = manifestNameModifier;
    }

    /**
     * Specify a name modifier that the service adds to the name of this manifest to make it different from the file
     * names of the other main manifests in the output group. For example, say that the default main manifest for your
     * DASH group is film-name.mpd. If you enter "-no-premium" for this setting, then the file name the service generates
     * for this top-level manifest is film-name-no-premium.mpd.
     * 
     * @return Specify a name modifier that the service adds to the name of this manifest to make it different from the
     *         file names of the other main manifests in the output group. For example, say that the default main
     *         manifest for your DASH group is film-name.mpd. If you enter "-no-premium" for this setting, then the file
     *         name the service generates for this top-level manifest is film-name-no-premium.mpd.
     */

    public String getManifestNameModifier() {
        return this.manifestNameModifier;
    }

    /**
     * Specify a name modifier that the service adds to the name of this manifest to make it different from the file
     * names of the other main manifests in the output group. For example, say that the default main manifest for your
     * DASH group is film-name.mpd. If you enter "-no-premium" for this setting, then the file name the service generates
     * for this top-level manifest is film-name-no-premium.mpd.
     * 
     * @param manifestNameModifier
     *        Specify a name modifier that the service adds to the name of this manifest to make it different from the
     *        file names of the other main manifests in the output group. For example, say that the default main
     *        manifest for your DASH group is film-name.mpd. If you enter "-no-premium" for this setting, then the file
     *        name the service generates for this top-level manifest is film-name-no-premium.mpd.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashAdditionalManifest withManifestNameModifier(String manifestNameModifier) {
        setManifestNameModifier(manifestNameModifier);
        return this;
    }

    /**
     * Specify the outputs that you want this additional top-level manifest to reference.
     * 
     * @return Specify the outputs that you want this additional top-level manifest to reference.
     */

    public java.util.List<String> getSelectedOutputs() {
        return selectedOutputs;
    }

    /**
     * Specify the outputs that you want this additional top-level manifest to reference.
     * 
     * @param selectedOutputs
     *        Specify the outputs that you want this additional top-level manifest to reference.
     */

    public void setSelectedOutputs(java.util.Collection<String> selectedOutputs) {
        if (selectedOutputs == null) {
            this.selectedOutputs = null;
            return;
        }

        this.selectedOutputs = new java.util.ArrayList<String>(selectedOutputs);
    }

    /**
     * Specify the outputs that you want this additional top-level manifest to reference.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedOutputs(java.util.Collection)} or {@link #withSelectedOutputs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param selectedOutputs
     *        Specify the outputs that you want this additional top-level manifest to reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashAdditionalManifest withSelectedOutputs(String... selectedOutputs) {
        if (this.selectedOutputs == null) {
            setSelectedOutputs(new java.util.ArrayList<String>(selectedOutputs.length));
        }
        for (String ele : selectedOutputs) {
            this.selectedOutputs.add(ele);
        }
        return this;
    }

    /**
     * Specify the outputs that you want this additional top-level manifest to reference.
     * 
     * @param selectedOutputs
     *        Specify the outputs that you want this additional top-level manifest to reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashAdditionalManifest withSelectedOutputs(java.util.Collection<String> selectedOutputs) {
        setSelectedOutputs(selectedOutputs);
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
        if (getManifestNameModifier() != null)
            sb.append("ManifestNameModifier: ").append(getManifestNameModifier()).append(",");
        if (getSelectedOutputs() != null)
            sb.append("SelectedOutputs: ").append(getSelectedOutputs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashAdditionalManifest == false)
            return false;
        DashAdditionalManifest other = (DashAdditionalManifest) obj;
        if (other.getManifestNameModifier() == null ^ this.getManifestNameModifier() == null)
            return false;
        if (other.getManifestNameModifier() != null && other.getManifestNameModifier().equals(this.getManifestNameModifier()) == false)
            return false;
        if (other.getSelectedOutputs() == null ^ this.getSelectedOutputs() == null)
            return false;
        if (other.getSelectedOutputs() != null && other.getSelectedOutputs().equals(this.getSelectedOutputs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestNameModifier() == null) ? 0 : getManifestNameModifier().hashCode());
        hashCode = prime * hashCode + ((getSelectedOutputs() == null) ? 0 : getSelectedOutputs().hashCode());
        return hashCode;
    }

    @Override
    public DashAdditionalManifest clone() {
        try {
            return (DashAdditionalManifest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.DashAdditionalManifestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
