import jenkins.model.Jenkins
import org.jenkinsci.plugins.xvfb.*

def Xvfb() {
    def installation = new XvfbInstallation('default', 'C:\\Users\\n.krastev\\Documents\\GitHub\\Xvfb\\bin', null)

    Jenkins.getInstance()
            .getDescriptorByType(Xvfb.XvfbBuildWrapperDescriptor.class)
            .setInstallations(installation)

}