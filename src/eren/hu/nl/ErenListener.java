/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eren.hu.nl;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

import org.openide.util.actions.Presenter;

@ActionID(
        category = "File",
        id = "eren.hu.nl.ErenListener"
)
@ActionRegistration(
        iconBase = "eren/hu/nl/google24.png",
        displayName = "#CTL_ErenListener"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 0)
    ,
  @ActionReference(path = "Toolbars/File", position = 0)
})
@Messages("CTL_ErenListener=Google")
public final class ErenListener extends AbstractAction implements Presenter.Toolbar {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }

    @Override
    public Component getToolbarPresenter() {
       return new  NewJPanel();
    }
}
