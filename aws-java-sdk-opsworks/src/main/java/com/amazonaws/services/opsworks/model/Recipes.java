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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * AWS OpsWorks Stacks supports five lifecycle events: <b>setup</b>, <b>configuration</b>, <b>deploy</b>,
 * <b>undeploy</b>, and <b>shutdown</b>. For each layer, AWS OpsWorks Stacks runs a set of standard recipes for each
 * event. In addition, you can provide custom recipes for any or all layers and events. AWS OpsWorks Stacks runs custom
 * event recipes after the standard recipes. <code>LayerCustomRecipes</code> specifies the custom recipes for a
 * particular layer to be run in response to each of the five events.
 * </p>
 * <p>
 * To specify a recipe, use the cookbook's directory name in the repository followed by two colons and the recipe name,
 * which is the recipe's file name without the .rb extension. For example: phpapp2::dbsetup specifies the dbsetup.rb
 * recipe in the repository's phpapp2 folder.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/Recipes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recipes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>setup</code> event.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> setup;
    /**
     * <p>
     * An array of custom recipe names to be run following a <code>configure</code> event.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> configure;
    /**
     * <p>
     * An array of custom recipe names to be run following a <code>deploy</code> event.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> deploy;
    /**
     * <p>
     * An array of custom recipe names to be run following a <code>undeploy</code> event.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> undeploy;
    /**
     * <p>
     * An array of custom recipe names to be run following a <code>shutdown</code> event.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> shutdown;

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>setup</code> event.
     * </p>
     * 
     * @return An array of custom recipe names to be run following a <code>setup</code> event.
     */

    public java.util.List<String> getSetup() {
        if (setup == null) {
            setup = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return setup;
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>setup</code> event.
     * </p>
     * 
     * @param setup
     *        An array of custom recipe names to be run following a <code>setup</code> event.
     */

    public void setSetup(java.util.Collection<String> setup) {
        if (setup == null) {
            this.setup = null;
            return;
        }

        this.setup = new com.amazonaws.internal.SdkInternalList<String>(setup);
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>setup</code> event.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSetup(java.util.Collection)} or {@link #withSetup(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param setup
     *        An array of custom recipe names to be run following a <code>setup</code> event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipes withSetup(String... setup) {
        if (this.setup == null) {
            setSetup(new com.amazonaws.internal.SdkInternalList<String>(setup.length));
        }
        for (String ele : setup) {
            this.setup.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>setup</code> event.
     * </p>
     * 
     * @param setup
     *        An array of custom recipe names to be run following a <code>setup</code> event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipes withSetup(java.util.Collection<String> setup) {
        setSetup(setup);
        return this;
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>configure</code> event.
     * </p>
     * 
     * @return An array of custom recipe names to be run following a <code>configure</code> event.
     */

    public java.util.List<String> getConfigure() {
        if (configure == null) {
            configure = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return configure;
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>configure</code> event.
     * </p>
     * 
     * @param configure
     *        An array of custom recipe names to be run following a <code>configure</code> event.
     */

    public void setConfigure(java.util.Collection<String> configure) {
        if (configure == null) {
            this.configure = null;
            return;
        }

        this.configure = new com.amazonaws.internal.SdkInternalList<String>(configure);
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>configure</code> event.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigure(java.util.Collection)} or {@link #withConfigure(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param configure
     *        An array of custom recipe names to be run following a <code>configure</code> event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipes withConfigure(String... configure) {
        if (this.configure == null) {
            setConfigure(new com.amazonaws.internal.SdkInternalList<String>(configure.length));
        }
        for (String ele : configure) {
            this.configure.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>configure</code> event.
     * </p>
     * 
     * @param configure
     *        An array of custom recipe names to be run following a <code>configure</code> event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipes withConfigure(java.util.Collection<String> configure) {
        setConfigure(configure);
        return this;
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>deploy</code> event.
     * </p>
     * 
     * @return An array of custom recipe names to be run following a <code>deploy</code> event.
     */

    public java.util.List<String> getDeploy() {
        if (deploy == null) {
            deploy = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return deploy;
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>deploy</code> event.
     * </p>
     * 
     * @param deploy
     *        An array of custom recipe names to be run following a <code>deploy</code> event.
     */

    public void setDeploy(java.util.Collection<String> deploy) {
        if (deploy == null) {
            this.deploy = null;
            return;
        }

        this.deploy = new com.amazonaws.internal.SdkInternalList<String>(deploy);
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>deploy</code> event.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploy(java.util.Collection)} or {@link #withDeploy(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param deploy
     *        An array of custom recipe names to be run following a <code>deploy</code> event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipes withDeploy(String... deploy) {
        if (this.deploy == null) {
            setDeploy(new com.amazonaws.internal.SdkInternalList<String>(deploy.length));
        }
        for (String ele : deploy) {
            this.deploy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>deploy</code> event.
     * </p>
     * 
     * @param deploy
     *        An array of custom recipe names to be run following a <code>deploy</code> event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipes withDeploy(java.util.Collection<String> deploy) {
        setDeploy(deploy);
        return this;
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>undeploy</code> event.
     * </p>
     * 
     * @return An array of custom recipe names to be run following a <code>undeploy</code> event.
     */

    public java.util.List<String> getUndeploy() {
        if (undeploy == null) {
            undeploy = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return undeploy;
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>undeploy</code> event.
     * </p>
     * 
     * @param undeploy
     *        An array of custom recipe names to be run following a <code>undeploy</code> event.
     */

    public void setUndeploy(java.util.Collection<String> undeploy) {
        if (undeploy == null) {
            this.undeploy = null;
            return;
        }

        this.undeploy = new com.amazonaws.internal.SdkInternalList<String>(undeploy);
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>undeploy</code> event.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUndeploy(java.util.Collection)} or {@link #withUndeploy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param undeploy
     *        An array of custom recipe names to be run following a <code>undeploy</code> event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipes withUndeploy(String... undeploy) {
        if (this.undeploy == null) {
            setUndeploy(new com.amazonaws.internal.SdkInternalList<String>(undeploy.length));
        }
        for (String ele : undeploy) {
            this.undeploy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>undeploy</code> event.
     * </p>
     * 
     * @param undeploy
     *        An array of custom recipe names to be run following a <code>undeploy</code> event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipes withUndeploy(java.util.Collection<String> undeploy) {
        setUndeploy(undeploy);
        return this;
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>shutdown</code> event.
     * </p>
     * 
     * @return An array of custom recipe names to be run following a <code>shutdown</code> event.
     */

    public java.util.List<String> getShutdown() {
        if (shutdown == null) {
            shutdown = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return shutdown;
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>shutdown</code> event.
     * </p>
     * 
     * @param shutdown
     *        An array of custom recipe names to be run following a <code>shutdown</code> event.
     */

    public void setShutdown(java.util.Collection<String> shutdown) {
        if (shutdown == null) {
            this.shutdown = null;
            return;
        }

        this.shutdown = new com.amazonaws.internal.SdkInternalList<String>(shutdown);
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>shutdown</code> event.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setShutdown(java.util.Collection)} or {@link #withShutdown(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param shutdown
     *        An array of custom recipe names to be run following a <code>shutdown</code> event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipes withShutdown(String... shutdown) {
        if (this.shutdown == null) {
            setShutdown(new com.amazonaws.internal.SdkInternalList<String>(shutdown.length));
        }
        for (String ele : shutdown) {
            this.shutdown.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of custom recipe names to be run following a <code>shutdown</code> event.
     * </p>
     * 
     * @param shutdown
     *        An array of custom recipe names to be run following a <code>shutdown</code> event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipes withShutdown(java.util.Collection<String> shutdown) {
        setShutdown(shutdown);
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
        if (getSetup() != null)
            sb.append("Setup: ").append(getSetup()).append(",");
        if (getConfigure() != null)
            sb.append("Configure: ").append(getConfigure()).append(",");
        if (getDeploy() != null)
            sb.append("Deploy: ").append(getDeploy()).append(",");
        if (getUndeploy() != null)
            sb.append("Undeploy: ").append(getUndeploy()).append(",");
        if (getShutdown() != null)
            sb.append("Shutdown: ").append(getShutdown());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Recipes == false)
            return false;
        Recipes other = (Recipes) obj;
        if (other.getSetup() == null ^ this.getSetup() == null)
            return false;
        if (other.getSetup() != null && other.getSetup().equals(this.getSetup()) == false)
            return false;
        if (other.getConfigure() == null ^ this.getConfigure() == null)
            return false;
        if (other.getConfigure() != null && other.getConfigure().equals(this.getConfigure()) == false)
            return false;
        if (other.getDeploy() == null ^ this.getDeploy() == null)
            return false;
        if (other.getDeploy() != null && other.getDeploy().equals(this.getDeploy()) == false)
            return false;
        if (other.getUndeploy() == null ^ this.getUndeploy() == null)
            return false;
        if (other.getUndeploy() != null && other.getUndeploy().equals(this.getUndeploy()) == false)
            return false;
        if (other.getShutdown() == null ^ this.getShutdown() == null)
            return false;
        if (other.getShutdown() != null && other.getShutdown().equals(this.getShutdown()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSetup() == null) ? 0 : getSetup().hashCode());
        hashCode = prime * hashCode + ((getConfigure() == null) ? 0 : getConfigure().hashCode());
        hashCode = prime * hashCode + ((getDeploy() == null) ? 0 : getDeploy().hashCode());
        hashCode = prime * hashCode + ((getUndeploy() == null) ? 0 : getUndeploy().hashCode());
        hashCode = prime * hashCode + ((getShutdown() == null) ? 0 : getShutdown().hashCode());
        return hashCode;
    }

    @Override
    public Recipes clone() {
        try {
            return (Recipes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.RecipesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
