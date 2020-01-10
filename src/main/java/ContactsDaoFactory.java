public class ContactsDaoFactory {
    private static Contacts contactsDao;

    public static Contacts contactsDao() {
        if (contactsDao == null) {
            contactsDao = new ContactListDao();
        }
        return contactsDao;
    }

}
