import Layout from "../../components/layout";

import React from "react";
import { Header, Icon, Image, Menu, Segment, Sidebar } from "semantic-ui-react";

export default function Manager() {
  return (
    <>
      <Layout className="sidebar">
        
        <Sidebar.Pushable as={Segment}>
          <Sidebar
            as={Menu}
            animation="overlay"
            icon="labeled"
            inverted
            vertical
            visible
            width="thin"
          >
          </Sidebar>

          <Sidebar.Pusher>
            <Segment basic>
              <Header as="h3">YÖNETİCİ SAYFASI</Header>
              <Image src="" />
            </Segment>
          </Sidebar.Pusher>
        </Sidebar.Pushable>
       
      </Layout>
    </>
  );
}
