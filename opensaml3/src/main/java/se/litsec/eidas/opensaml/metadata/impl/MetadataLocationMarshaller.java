/*
 * Copyright 2016-2019 Litsec AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package se.litsec.eidas.opensaml.metadata.impl;

import org.opensaml.core.xml.XMLObject;
import org.opensaml.core.xml.io.MarshallingException;
import org.opensaml.saml.common.AbstractSAMLObjectMarshaller;
import org.w3c.dom.Element;

import se.litsec.eidas.opensaml.metadata.MetadataLocation;

/**
 * A marshaller for {@link MetadataLocation}.
 * 
 * @author Martin Lindström (martin.lindstrom@litsec.se)
 */
public class MetadataLocationMarshaller extends AbstractSAMLObjectMarshaller {

  /** {@inheritDoc} */
  @Override
  protected void marshallAttributes(XMLObject xmlObject, Element domElement) throws MarshallingException {

    MetadataLocation mdl = (MetadataLocation) xmlObject;

    if (mdl.getLocation() != null) {
      domElement.setAttributeNS(null, MetadataLocation.LOCATION_ATTR_NAME, mdl.getLocation());
    }
    this.marshallUnknownAttributes(mdl, domElement);
  }

}
