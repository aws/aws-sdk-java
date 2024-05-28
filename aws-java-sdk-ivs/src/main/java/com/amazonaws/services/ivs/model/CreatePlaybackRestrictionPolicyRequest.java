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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreatePlaybackRestrictionPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePlaybackRestrictionPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of country codes that control geoblocking restriction. Allowed values are the officially assigned <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All countries (an
     * empty array).
     * </p>
     */
    private java.util.List<String> allowedCountries;
    /**
     * <p>
     * A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the Origin
     * header defined at <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https://developer.mozilla
     * .org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     * </p>
     */
    private java.util.List<String> allowedOrigins;
    /**
     * <p>
     * Whether channel playback is constrained by origin site. Default: <code>false</code>.
     * </p>
     */
    private Boolean enableStrictOriginEnforcement;
    /**
     * <p>
     * Playback-restriction-policy name. The value does not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     * IVS has no service-specific constraints beyond what is documented there.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A list of country codes that control geoblocking restriction. Allowed values are the officially assigned <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All countries (an
     * empty array).
     * </p>
     * 
     * @return A list of country codes that control geoblocking restriction. Allowed values are the officially assigned
     *         <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All
     *         countries (an empty array).
     */

    public java.util.List<String> getAllowedCountries() {
        return allowedCountries;
    }

    /**
     * <p>
     * A list of country codes that control geoblocking restriction. Allowed values are the officially assigned <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All countries (an
     * empty array).
     * </p>
     * 
     * @param allowedCountries
     *        A list of country codes that control geoblocking restriction. Allowed values are the officially assigned
     *        <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All
     *        countries (an empty array).
     */

    public void setAllowedCountries(java.util.Collection<String> allowedCountries) {
        if (allowedCountries == null) {
            this.allowedCountries = null;
            return;
        }

        this.allowedCountries = new java.util.ArrayList<String>(allowedCountries);
    }

    /**
     * <p>
     * A list of country codes that control geoblocking restriction. Allowed values are the officially assigned <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All countries (an
     * empty array).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedCountries(java.util.Collection)} or {@link #withAllowedCountries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param allowedCountries
     *        A list of country codes that control geoblocking restriction. Allowed values are the officially assigned
     *        <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All
     *        countries (an empty array).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaybackRestrictionPolicyRequest withAllowedCountries(String... allowedCountries) {
        if (this.allowedCountries == null) {
            setAllowedCountries(new java.util.ArrayList<String>(allowedCountries.length));
        }
        for (String ele : allowedCountries) {
            this.allowedCountries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of country codes that control geoblocking restriction. Allowed values are the officially assigned <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All countries (an
     * empty array).
     * </p>
     * 
     * @param allowedCountries
     *        A list of country codes that control geoblocking restriction. Allowed values are the officially assigned
     *        <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All
     *        countries (an empty array).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaybackRestrictionPolicyRequest withAllowedCountries(java.util.Collection<String> allowedCountries) {
        setAllowedCountries(allowedCountries);
        return this;
    }

    /**
     * <p>
     * A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the Origin
     * header defined at <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https://developer.mozilla
     * .org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     * </p>
     * 
     * @return A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the
     *         Origin header defined at <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https:
     *         //developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     */

    public java.util.List<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    /**
     * <p>
     * A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the Origin
     * header defined at <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https://developer.mozilla
     * .org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     * </p>
     * 
     * @param allowedOrigins
     *        A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the
     *        Origin header defined at <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https:/
     *        /developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     */

    public void setAllowedOrigins(java.util.Collection<String> allowedOrigins) {
        if (allowedOrigins == null) {
            this.allowedOrigins = null;
            return;
        }

        this.allowedOrigins = new java.util.ArrayList<String>(allowedOrigins);
    }

    /**
     * <p>
     * A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the Origin
     * header defined at <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https://developer.mozilla
     * .org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedOrigins(java.util.Collection)} or {@link #withAllowedOrigins(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedOrigins
     *        A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the
     *        Origin header defined at <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https:/
     *        /developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaybackRestrictionPolicyRequest withAllowedOrigins(String... allowedOrigins) {
        if (this.allowedOrigins == null) {
            setAllowedOrigins(new java.util.ArrayList<String>(allowedOrigins.length));
        }
        for (String ele : allowedOrigins) {
            this.allowedOrigins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the Origin
     * header defined at <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https://developer.mozilla
     * .org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     * </p>
     * 
     * @param allowedOrigins
     *        A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the
     *        Origin header defined at <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https:/
     *        /developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaybackRestrictionPolicyRequest withAllowedOrigins(java.util.Collection<String> allowedOrigins) {
        setAllowedOrigins(allowedOrigins);
        return this;
    }

    /**
     * <p>
     * Whether channel playback is constrained by origin site. Default: <code>false</code>.
     * </p>
     * 
     * @param enableStrictOriginEnforcement
     *        Whether channel playback is constrained by origin site. Default: <code>false</code>.
     */

    public void setEnableStrictOriginEnforcement(Boolean enableStrictOriginEnforcement) {
        this.enableStrictOriginEnforcement = enableStrictOriginEnforcement;
    }

    /**
     * <p>
     * Whether channel playback is constrained by origin site. Default: <code>false</code>.
     * </p>
     * 
     * @return Whether channel playback is constrained by origin site. Default: <code>false</code>.
     */

    public Boolean getEnableStrictOriginEnforcement() {
        return this.enableStrictOriginEnforcement;
    }

    /**
     * <p>
     * Whether channel playback is constrained by origin site. Default: <code>false</code>.
     * </p>
     * 
     * @param enableStrictOriginEnforcement
     *        Whether channel playback is constrained by origin site. Default: <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaybackRestrictionPolicyRequest withEnableStrictOriginEnforcement(Boolean enableStrictOriginEnforcement) {
        setEnableStrictOriginEnforcement(enableStrictOriginEnforcement);
        return this;
    }

    /**
     * <p>
     * Whether channel playback is constrained by origin site. Default: <code>false</code>.
     * </p>
     * 
     * @return Whether channel playback is constrained by origin site. Default: <code>false</code>.
     */

    public Boolean isEnableStrictOriginEnforcement() {
        return this.enableStrictOriginEnforcement;
    }

    /**
     * <p>
     * Playback-restriction-policy name. The value does not need to be unique.
     * </p>
     * 
     * @param name
     *        Playback-restriction-policy name. The value does not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Playback-restriction-policy name. The value does not need to be unique.
     * </p>
     * 
     * @return Playback-restriction-policy name. The value does not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Playback-restriction-policy name. The value does not need to be unique.
     * </p>
     * 
     * @param name
     *        Playback-restriction-policy name. The value does not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaybackRestrictionPolicyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     * IVS has no service-specific constraints beyond what is documented there.
     * </p>
     * 
     * @return Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         Resources</a> for more information, including restrictions that apply to tags and
     *         "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is
     *         documented there.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     * IVS has no service-specific constraints beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a> for more information, including restrictions that apply to tags and
     *        "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is
     *        documented there.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     * IVS has no service-specific constraints beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>. See <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a> for more information, including restrictions that apply to tags and
     *        "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is
     *        documented there.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaybackRestrictionPolicyRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreatePlaybackRestrictionPolicyRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaybackRestrictionPolicyRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaybackRestrictionPolicyRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAllowedCountries() != null)
            sb.append("AllowedCountries: ").append(getAllowedCountries()).append(",");
        if (getAllowedOrigins() != null)
            sb.append("AllowedOrigins: ").append(getAllowedOrigins()).append(",");
        if (getEnableStrictOriginEnforcement() != null)
            sb.append("EnableStrictOriginEnforcement: ").append(getEnableStrictOriginEnforcement()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePlaybackRestrictionPolicyRequest == false)
            return false;
        CreatePlaybackRestrictionPolicyRequest other = (CreatePlaybackRestrictionPolicyRequest) obj;
        if (other.getAllowedCountries() == null ^ this.getAllowedCountries() == null)
            return false;
        if (other.getAllowedCountries() != null && other.getAllowedCountries().equals(this.getAllowedCountries()) == false)
            return false;
        if (other.getAllowedOrigins() == null ^ this.getAllowedOrigins() == null)
            return false;
        if (other.getAllowedOrigins() != null && other.getAllowedOrigins().equals(this.getAllowedOrigins()) == false)
            return false;
        if (other.getEnableStrictOriginEnforcement() == null ^ this.getEnableStrictOriginEnforcement() == null)
            return false;
        if (other.getEnableStrictOriginEnforcement() != null
                && other.getEnableStrictOriginEnforcement().equals(this.getEnableStrictOriginEnforcement()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedCountries() == null) ? 0 : getAllowedCountries().hashCode());
        hashCode = prime * hashCode + ((getAllowedOrigins() == null) ? 0 : getAllowedOrigins().hashCode());
        hashCode = prime * hashCode + ((getEnableStrictOriginEnforcement() == null) ? 0 : getEnableStrictOriginEnforcement().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePlaybackRestrictionPolicyRequest clone() {
        return (CreatePlaybackRestrictionPolicyRequest) super.clone();
    }

}
