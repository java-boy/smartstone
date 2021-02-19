export const properties = {
    queryTimeout: 500,
    authToken: Liferay.authToken,
    portalURL: Liferay.ThemeDisplay.getPortalURL()
};

const endpointPaths = {
    attributeTypesEndpoint: '/o/headless/v1.0/attributeTypes'
};

for (const key in endpointPaths) {
    endpointPaths[key] = properties.portalURL + endpointPaths[key] + '?p_auth=' + properties.authToken;
}

Object.assign(properties, endpointPaths);